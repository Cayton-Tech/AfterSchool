unit testExtraItem_Uxxxx;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, Menus, StdCtrls, ComCtrls;

type
  TfrmQuest2 = class(TForm)
    MainMenu1: TMainMenu;
    OptionList: TMenuItem;
    OptionQuit: TMenuItem;
    redOutput: TRichEdit;
    procedure Quit1Click(Sender: TObject);
    procedure FormActivate(Sender: TObject);
    procedure OptionListClick(Sender: TObject);
    procedure OptionQuitClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmQuest2: TfrmQuest2;

implementation

uses ExtraItemXXXX;
var
  arrItems :array[1..20] of TExtraItem;
  iCount    :integer;

{$R *.dfm}


procedure TfrmQuest2.Quit1Click(Sender: TObject);
begin
  Close;
end;

procedure TfrmQuest2.FormActivate(Sender: TObject);
var
  TFile :TextFile;
  sLine, sGuestNumber, sItemType :String;
  rCost           :real;
  iHash           :integer;

begin
  if fileExists('Extras.txt') <> true then
    begin
      ShowMessage('The text file ''Extras.txt'' does not exist');
      Exit;
    end;
    AssignFile(TFile, 'Extras.txt');
    Reset(TFile);
    iCount := 0;
    While not eof(TFile) do
      begin
        inc(iCount);
        readln(TFile, sLine);
        iHash := pos ('#', sLine);
        sGuestNumber := copy(sLine, 1, iHash -1);
        delete(sLine, 1, iHash);
        iHash := pos ('#', sLine);
        delete(sLine, 1, iHash);
        iHash := pos ('#', sLine);
        sItemType := copy(sLine, 1, iHash -1);
        delete(sLine, 1, iHash);
        rCost := StrToFloat(sLine);
        arrItems[iCount] := TExtraItem.Create(sGuestNumber, sItemType, rCost);
     end;
     CloseFile(TFile);

     redOutput.Paragraph.TabCount := 2;
     redOutput.Paragraph.Tab[0] := 60;
     redOutput.Paragraph.Tab[1] := 100;
     redOutput.Paragraph.Tab[2] := 140;

end;

procedure TfrmQuest2.OptionListClick(Sender: TObject);
var
  K             :integer;
  rTotalAmount  :real;
  sGuest        :String;
begin
  sGuest := InputBox('Guest', 'Enter the guest number', '');
  rTotalAmount := 0;
  redOutput.Clear;
  redOutput.Lines.add('Information on extra items for guest number ' + sGuest);
  redOutput.Lines.add('');
  redOutput.Lines.add('Item                    Cost              Profit         Price');
  For K := 1 to iCount do
  begin
    if arrItems[K].getGuestNumber = sGuest then
      begin
        redOutput.Lines.add(arrItems[K].toString);
        rTotalAmount := rTotalAmount + arrItems[K].calculatePrice;
      end;
    end;
     redOutput.Lines.Add(' ');
    if rTotalAmount = 0 then
      ShowMessage('No extra items found for guest number ' + sGuest)
    else
      redOutput.Lines.add('The total amount due is ' + FloatToStrF(rTotalAmount, ffCurrency,8,2));
end;


procedure TfrmQuest2.OptionQuitClick(Sender: TObject);

begin
   Close;
end;

end.
