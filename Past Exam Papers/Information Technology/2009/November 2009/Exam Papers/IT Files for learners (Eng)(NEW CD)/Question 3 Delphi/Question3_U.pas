unit Question3_U;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ComCtrls, Menus;

type
  TForm1 = class(TForm)
    MainMenu1: TMainMenu;
    mnuConvert: TMenuItem;
    mnuDisplay: TMenuItem;
    redDisplay: TRichEdit;
    mnuQuit: TMenuItem;
    procedure FormCreate(Sender: TObject);
    procedure mnuQuitClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

Const
    Max = 20;

Type
    PhoneArr = Array [1..Max] of string;

Var
    PhoneNos  : PhoneArr;
    NoCnt     : integer;

{$R *.dfm}

procedure TForm1.FormCreate(Sender: TObject);
begin
  PhoneNos [1] := '086 New Hill';
  PhoneNos [2] := '086 Dial Bar';
  PhoneNos [3] := '086 Bay View';
  PhoneNos [4] := '086 Kya Sand';
  PhoneNos [5] := '086 SowetoN';
  PhoneNos [6] := '086 Casa Sol';
  PhoneNos [7] := '086 The Havn';
  PhoneNos [8] := '086 Get Food';
  PhoneNos [9] := '086 Thai Plc';
  PhoneNos [10] := '086 Cleaner';
  PhoneNos [11] := '086 Casa Rok';
  PhoneNos [12] := '086 Rix Taxi';
  PhoneNos [13] := '086 Air Time';
  PhoneNos [14] := '086 Dial Bed';
  PhoneNos [15] := '086 Dial Car';
  PhoneNos [16] := '086 Dial Hlp';
  PhoneNos [17] := '086 Kya Rosa';
  PhoneNos [18] := '086 Bay Sand';
  PhoneNos [19] := '086 Cater 4 U';
  PhoneNos [20] := '086 1to1 Air';
  NoCnt := 20;
end;

procedure TForm1.mnuQuitClick(Sender: TObject);
begin
  Close;
end;


end.
