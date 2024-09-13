unit Question3_U;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, Menus, StdCtrls, ComCtrls;

type
  TfrmSMSComp = class(TForm)
    MainMenu1: TMainMenu;
    Processing: TMenuItem;
    ExtractPossibleWinners: TMenuItem;
    SelectAndDisplayWinners: TMenuItem;
    redDisplay: TRichEdit;
    SaveWinners: TMenuItem;
    Quit1: TMenuItem;
 
    //procedure SaveWinnersClick(Sender: TObject);
    procedure Quit1Click(Sender: TObject);
    procedure FormCreate(Sender: TObject); private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmSMSComp: TfrmSMSComp;
  arrEntries : array[1..20] of string;

  iCounter :integer;


implementation

{$R *.dfm}

procedure TfrmSMSComp.Quit1Click(Sender: TObject);
begin
  Close;
end;

procedure TfrmSMSComp.FormCreate(Sender: TObject);
begin
      arrEntries[1] := '082 345 4571:Exercise';
   		arrEntries[2] := '082543 2341:Exercise';
   		arrEntries[3] := '082 234 1241:EXERCISE';
   		arrEntries[4] := '0821239876:Eat';
   		arrEntries[5] := '083123 6123:Sleep';
   		arrEntries[6] := '083 452 4353:EXERCISE';
   		arrEntries[7] := '0831009844:Sleep';
   		arrEntries[8] := '083 104 2333:Exercise';
   		arrEntries[9] := '076 239 6966:Sleep';
   		arrEntries[10] := '076986 4533:EAT';
   		arrEntries[11] := '076 365 4272:Exercise';
   		arrEntries[12] := '076563 2642:Exercise';
   		arrEntries[13] := '084 884 1244:EXERCISE';
   		arrEntries[14] := '0841239867:Sleep';
   		arrEntries[15] := '084123 6444:Exercise';
   		arrEntries[16] := '084 1156 434:Exercise';
   		arrEntries[17] := '079 1229 844:Eat';
   		arrEntries[18] := '079 456 2331:Exercise';
   		arrEntries[19] := '079 239 7971:EXERCISE';
   		arrEntries[20] := '079986 6622:EAT';
      iCounter := 20;
end;

end.
