unit testAdvert_UMemo;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, Menus,  StdCtrls, ComCtrls;

type
  TfrmNewsPaper = class(TForm)
    MainMenu1: TMainMenu;
    Aderts1: TMenuItem;
    ListArray: TMenuItem;
    SumIncome: TMenuItem;
    Quit1: TMenuItem;
    redOutput: TRichEdit;
    LookupClient: TMenuItem;
    procedure Quit1Click(Sender: TObject);
    procedure FormActivate(Sender: TObject);
    procedure ListArrayClick(Sender: TObject);

    procedure SumIncomeClick(Sender: TObject);
    procedure LookupClientClick(Sender: TObject);
   

    
  private

  public
    { Public declarations }
  end;

var
  frmNewsPaper: TfrmNewsPaper;
  
implementation
uses
  AdvertU_xxxx;
var
  Advert      :TAdvert;
  arrAdverts  :array[1..50] of TAdvert;
  iCount      :integer;



{$R *.dfm}

procedure TfrmNewsPaper.Quit1Click(Sender: TObject);
begin
 Application.Terminate;
end;

procedure TfrmNewsPaper.FormActivate(Sender: TObject);
var
  iHash   :integer;
  oneLine :string;
  TextF   :TextFile;
  AdText  :string;
  ClName  :string;
begin
  AssignFile(TextF, 'Advertisements.txt');
  if FileExists('Advertisements.txt')<> true then
  begin
    ShowMessage('File not found');
    Exit;
  end;
  Reset(TextF);
  iCount := 0;
  While not eof(TextF) do
    begin
      inc(iCount);
      readln(TextF, oneLine);
      iHash := pos('#', oneLine);
      AdText := copy(oneLine, 1, iHash - 1);
      delete(oneLine, 1, iHash);
      ClName := oneLine;
      Advert := TAdvert.create(AdText, ClName);
      arrAdverts[iCount] := Advert;
    end;
    CloseFile(TextF);
end;



procedure TfrmNewsPaper.ListArrayClick(Sender: TObject);
var
  K : integer;
  rTotal :real;
begin
  redOutput.Paragraph.TabCount := 5;
  redOutput.Paragraph.Tab[1] := 20;
  redOutput.Paragraph.Tab[2] := 100;
  redOutput.Paragraph.Tab[3] := 150;
  redOutput.Paragraph.Tab[4] := 200;
  redOutput.Paragraph.Tab[5] := 230;
  redOutput.Clear;
  redOutput.Lines.Add('Information on Advertisements');
  redOutput.Lines.Add(' ');
  rTotal := 0;
  For K := 1 to iCount do
  begin
    redOutput.Lines.Add(arrAdverts[K].toString);
  end;
   redOutput.Lines.Add(' ');
   
end;

procedure TfrmNewsPaper.SumIncomeClick(Sender: TObject);
var
  K, hCount, fCount : integer;
  rTotal, hTotal, fTotal, rCost :real;
begin
  redOutput.Clear;
  redOutput.Lines.Add('Summary of income');
  redOutput.Lines.Add(' ');
  rTotal := 0;
  hCount := 0;
  fCount := 0;
  hTotal := 0;
  fTotal := 0;
  For K := 1 to iCount do
  begin
    rCost :=  arrAdverts[K].calculateCost;
    rTotal := rTotal +  rCost;
    if arrAdverts[K].isLowPolluter then
    begin
      hTotal := hTotal + rCost;
      hCount := hCount + 1;
     end
    else
      begin
       fTotal := fTotal + rCost;
       fCount := fCount + 1;
      end;

   end;
   redOutput.Lines.Add(IntToStr(iCount) + ' advertisements in total worth ' + FloatToStrF(rTotal, ffCurrency, 6, 2));
   redOutput.Lines.Add(' ');
   redOutput.Lines.Add(IntToStr(hCount) +' half-priced advertisements worth ' + FloatToStrF(hTotal, ffCurrency, 6, 2));
   redOutput.Lines.Add(' ');
   redOutput.Lines.Add(IntToStr(fCount) +' full-priced advertisements worth ' + FloatToStrF(fTotal, ffCurrency, 6, 2));


end;

procedure TfrmNewsPaper.LookupClientClick(Sender: TObject);
var
  sName :string;
  k :integer;
  found:boolean;
begin
  sName := InputBox('Enter the name of the client ','','');
  redOutput.Clear;
  Found := false;
  redOutput.Lines.Add('Result of the search: ');
   For K := 1 to iCount do
    begin
      if sName = arrAdverts[K].getClientName then
        begin
          redOutput.Lines.Add(arrAdverts[k].toString);
          Found := true;
        end;


     end;
   if not(Found) then
     redOutput.Lines.Add(sName + ' was not found');

end;





end.
