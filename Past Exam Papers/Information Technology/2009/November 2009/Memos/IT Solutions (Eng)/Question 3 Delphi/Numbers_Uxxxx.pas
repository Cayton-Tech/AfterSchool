unit Numbers_Uxxxx;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ComCtrls, Menus;

type
  TForm1 = class(TForm)
    MainMenu1: TMainMenu;
    ConvertandDisplay1: TMenuItem;
    Display: TMenuItem;
    redDisplay: TRichEdit;
    Quit1: TMenuItem;
    procedure FormCreate(Sender: TObject);
    procedure ConvertandDisplay1Click(Sender: TObject);
    procedure DisplayClick(Sender: TObject);
    procedure Quit1Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

Const Max = 20;

Type
    PhoneArr = Array [1..Max] of string;

Var
    arrPhoneNos, MyArr  : PhoneArr;
    NoCnt, NewCnt       : integer;

{$R *.dfm}

procedure TForm1.FormCreate(Sender: TObject);
begin
  arrPhoneNos [1] := '086NewHill';
  arrPhoneNos [2] := '086DialBar';
  arrPhoneNos [3] := '086BayView';
  arrPhoneNos [4] := '086KyaSand';
  arrPhoneNos [5] := '086SowetoN';
  arrPhoneNos [6] := '086CasaSol';
  arrPhoneNos [7] := '086TheHavn';
  arrPhoneNos [8] := '086GetFood';
  arrPhoneNos [9] := '086ThaiPlc';
  arrPhoneNos [10] := '086Cleaner';
  arrPhoneNos [11] := '086CasaRok';
  arrPhoneNos [12] := '086RixTaxi';
  arrPhoneNos [13] := '086AirTime';
  arrPhoneNos [14] := '086DialBed';
  arrPhoneNos [15] := '086DialCar';
  arrPhoneNos [16] := '086DialHlp';
  arrPhoneNos [17] := '086KyaRosa';
  arrPhoneNos [18] := '086BaySand';
  arrPhoneNos [19] := '086Cater4U';
  arrPhoneNos [20] := '0861to1Air';
  noCnt := 20;
end;

function Convert (sNumber : string) : string;
var
    ind    : integer;
    number : string;
Begin
  number := '';
  for ind := 1 to length (sNumber) do
  case upcase (sNumber[ind]) of
    'A'..'C' : number := number + '2';
    'D'..'F' : number := number + '3';
    'G'..'I' : number := number + '4';
    'J'..'L' : number := number + '5';
    'M'..'O' : number := number + '6';
    'P'..'S' : number := number + '7';
    'T'..'V' : number := number + '8';
    'W'..'Z' : number := number + '9';
  else number := number + sNumber[ind]
  end;
  insert(' ', number, 4);
  insert(' ', number, 8);
  result := number;
end;

procedure TForm1.ConvertandDisplay1Click(Sender: TObject);
var
    Ind    : integer;
    number : string;
begin
  redDisplay.clear;
  redDisplay.Lines.Add('Original Number      Converted Number');
  for ind := 1 to Max do
    begin
      number := arrPhoneNos[ind];
      arrPhoneNos[ind] := Convert(arrPhoneNos[ind]);
      redDisplay.Lines.add (number + #9 + arrPhoneNos[ind]);
    end;
end;

procedure TForm1.DisplayClick(Sender: TObject);
Var
   ind, dups, ind2  : integer;
   dup              : boolean;
begin
  redDisplay.lines.Clear;
  redDisplay.lines.Add('Duplicates');

  dups := 0;
  for ind := 1 to noCnt - 1 do
  begin
     dup := false;
     ind2 := ind + 1;
     while (ind2 < max) and (dup = false) do
     begin
       if arrPhoneNos[ind] = arrPhoneNos[ind2] then
       begin
         dup := true;
         redDisplay.Lines.add(arrPhoneNos[ind]);
         inc(dups);
       end
       else
         inc(ind2);
      end; // while

  end; // for

  if dups = 0 then
    redDisplay.lines.add ('No duplicates found!')
  else
    redDisplay.lines.add ('The number of duplicates : ' + IntToStr(dups))

end;

procedure TForm1.Quit1Click(Sender: TObject);
begin
  Close;
end;

end.

