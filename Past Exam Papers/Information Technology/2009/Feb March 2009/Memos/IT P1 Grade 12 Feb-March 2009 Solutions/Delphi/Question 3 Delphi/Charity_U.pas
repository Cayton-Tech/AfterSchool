unit Charity_U;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ComCtrls, Menus, Buttons;

type
  TForm1 = class(TForm)
    btnGenerateAndDisplay: TButton;
    redDisplay: TRichEdit;
    BitBtn1: TBitBtn;
    procedure FormCreate(Sender: TObject);
    procedure btnGenerateAndDisplayClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

Type
     CharityArr = Array [1..5] of String;
     GoldRushArr = Array[1..4, 1..4] of String;

 Var
    Charities : CharityArr;
    CharityName : CharityArr;
    GoldRushGrid : GoldRushArr;

{$R *.dfm}
Procedure InitialiseGoldRush;
Var
   Ind, Ind2 : Integer;
Begin
  for ind := 1 to 4 do
    for ind2 := 1 to 4 do
      begin
        GoldRushGrid [ind, ind2] := '';
      end;
end;

procedure TForm1.FormCreate(Sender: TObject);
begin
  InitialiseGoldRush;

end;

Procedure GenerateFunding;
Var
    Ind, Ind2 : Integer;
    CharNo, perc : integer;
    tmp : string;
Begin
  randomize;
  for ind := 1 to 5 do
    for ind2 := 1 to 5 do
      begin
        CharNo := random (5) + 1;
        case Charno of
          1 : tmp := 'C';
          2 : tmp := 'S';
          3 : tmp := 'A';
          4 : tmp := 'R';
          5 : tmp := 'W';
        end; // end of case
        perc := random (10) + 6;

        tmp := tmp + inttostr (perc);
        GoldRushGrid [ind, ind2] := tmp;
      end;
end;


procedure TForm1.btnGenerateAndDisplayClick(Sender: TObject);
Var Ind, Ind2, CInd : Integer;
    perc, tmp : string;
    PubTot, GovtTot, GrandTot :real;
begin
  redDisplay.Lines.Clear;
  GenerateFunding;

  redDisplay.Paragraph.TabCount := 4;
  redDisplay.Paragraph.Tab[0] := 65;
  redDisplay.Paragraph.Tab[1] := 65;
  redDisplay.Paragraph.Tab[2] := 65;
  redDisplay.Paragraph.Tab[3] := 65;

  // initialise array
  Charities[1]:= 'C'; CharityName[1] := 'CHOC';
  Charities[2]:= 'S'; CharityName[2] := 'Cansa';
  Charities[3]:= 'A'; CharityName[3] := 'Aids Africa';
  Charities[4]:= 'R'; CharityName[4] := 'Red Cross';
  Charities[5]:= 'W'; CharityName[5] := 'Battered Women & Children';
  
  //Display Grid
    redDisplay.Lines.Add('Grid with random values');
    for ind := 1 to 4 do
    begin
       tmp := '';
        for ind2 := 1 to 4 do
          begin
            tmp := tmp + GoldRushGrid[ind,ind2] + #9;
          end;
          redDisplay.Lines.Add(tmp);
    end;
   GrandTot := PubTot + GovtTot;
   redDisplay.Lines.Add(' ');
   redDisplay.Lines.Add(' ');

   redDisplay.Lines.Add('Amounts received per charity' + #13);
   redDisplay.Lines.Add('');
   redDisplay.Lines.Add('Total              Public               Government      Charity' + #13);
   for CInd := 1 to 5 do
    begin
      pubTot := 0;
      GovtTot := 0;
      GrandTot := 0;
      for ind := 1 to 4 do
        for ind2 := 1 to 4 do
          begin
            if GoldRushGrid[ind,ind2] [1] = Charities[CInd] then
              begin
                PubTot := PubTot + 50000;
                perc := copy (GoldRushGrid[ind,ind2], 2, 2);
                GovtTot := GovtTot + (50000 * strtoint (perc) / 100);
              end;
          end;
          GrandTot := PubTot + GovtTot;
          redDisplay.Lines.Add(FloatToStrf(GrandTot, ffCurrency,10,2) + #9 + FloatToStrf(PubTot, ffCurrency,10,2)+ #9+ FloatToStrf(GovtTot, ffCurrency,10,2) + #9 + CharityName[CInd]);
    end;
end;

end.

// the learner needs to store charities name, total public, total govt & final tot
// this can be done in 20 vars / array of records / array of objects

// In the same way, the answers in sub programs here could be done in OOP
// or even under event handlers on the main form.
// No method is specified, so the learner works with what they know best.

// Whatever way of implementation is chosen the marks go for the core concepts





