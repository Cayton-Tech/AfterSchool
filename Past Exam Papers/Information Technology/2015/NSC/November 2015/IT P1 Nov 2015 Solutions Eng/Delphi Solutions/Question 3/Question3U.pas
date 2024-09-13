unit Question3U;

// A solution for question 3.

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, Buttons, ExtCtrls, ComCtrls;

type
  TfrmQuestion3 = class(TForm)
    pnlClose: TPanel;
    bmbClose: TBitBtn;
    pnlInput: TPanel;
    grpInput: TGroupBox;
    lblWorkshopQuestion: TLabel;
    lblTopic: TLabel;
    lblDay: TLabel;
    cboTopic: TComboBox;
    lblOutput: TLabel;
    lbluserComponents: TLabel;
    redDisplay: TRichEdit;
    btnDisplay: TButton;
    btnBook: TButton;
    btnCancelWorkshop: TButton;
    btnWater: TButton;
    lstDay: TListBox;
    Label1: TLabel;
    procedure FormCreate(Sender: TObject);
    procedure btnDisplayClick(Sender: TObject);
    procedure btnBookClick(Sender: TObject);
    procedure display;
    procedure btnCancelWorkshopClick(Sender: TObject);
    procedure btnWaterClick(Sender: TObject);


  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmQuestion3: TfrmQuestion3;

implementation

{$R *.dfm}
{$R+}

CONST
  MaxRow: Integer = 6;
  MaxCol: Integer = 4;

var
  arrWorkshops: Array [1 .. 6] of string = (
    'Aerobics',
    'Body building',
    'Cardio',
    'Dancing',
    'Energy supplements',
    'First aid'
  );

  numWorkshops: Integer = 6;

  arrBooking: Array [1 .. 6, 1 .. 4] of Integer = ((11, 14, 5, 14),
    (15, 5, 20, 4), (10, 14, 16, 20), (20, 20, 20, 20), (16, 7, 10, 7),
    (10, 18, 13, 11));

procedure TfrmQuestion3.btnBookClick(Sender: TObject);
var
  sWorkshop, sMsg: string;
  i, iD, iW: Integer;
begin
  sWorkshop := cboTopic.Text;
  iW := 0;
  for i := 1 to numWorkshops do
    if sWorkshop = arrWorkshops[i] then
      iW := i;
  if iW > 0 then
  begin
    iD := lstDay.ItemIndex + 1;
    if arrBooking[iW, iD] < 20 then
    begin
      Inc(arrBooking[iW, iD]);
      sMsg := sWorkshop + ' on day ' + IntToStr(iD) + ' is successfully booked';

    end
    else
      sMsg := sWorkshop + ' on day ' + IntToStr(iD)   + ' is fully booked';

  end
  else
    sMsg := 'Workshop: ' + sWorkshop + ' NOT AVAILABLE';

  MessageDlg(sMsg, mtInformation, [mbOk], 0);
  display;
end;

procedure TfrmQuestion3.btnDisplayClick(Sender: TObject);

begin
  display;
end;

procedure TfrmQuestion3.btnCancelWorkshopClick(Sender: TObject);
var
  i, w, d, iRemoveLine: Integer;
  sLine, sWorkshop: String;

begin
  iRemoveLine := 0;
  sWorkshop := cboTopic.Text;
  for i := 1 to numWorkshops do
    if sWorkshop = arrWorkshops[i] then
    begin
      iRemoveLine := i;

      for w := iRemoveLine to numWorkshops - 1 do
        arrWorkshops[w] := arrWorkshops[w + 1];

      for d := 1 to 4 do
        for w := iRemoveLine to numWorkshops - 1 do
          arrBooking[w, d] := arrBooking[w + 1, d];

      Dec(numWorkshops);
    end;
  display;
end;

procedure TfrmQuestion3.btnWaterClick(Sender: TObject);
var
  w, d, iTotal, iDayTot: Integer;
  sLine: String;

begin
  redDisplay.Lines.Add(#10 + 'Bottles of water needed');
  iTotal := 0;
  for d := 1 to 4 do
  begin
    iDayTot := 0;
    for w := 1 to numWorkshops do
      iDayTot := iDayTot + arrBooking[w, d];
    redDisplay.Lines.Add('Day ' + IntToStr(d) + #9 + IntToStr(iDayTot));
    iTotal := iTotal + iDayTot;
  end;
  redDisplay.Lines.Add(#10 + 'Total: ' + #9 + IntToStr(iTotal));
  redDisplay.Lines.Add('Cases of water needed:' + #9 + IntToStr
      ((iTotal + 12) div 24));

end;


procedure TfrmQuestion3.display;

var
  w, d: Integer;
  sLine: String;

begin
  redDisplay.Clear;
  redDisplay.Paragraph.TabCount := 4;
  redDisplay.Paragraph.Tab[0] := 150;
  redDisplay.Paragraph.Tab[1] := 200;
  redDisplay.Paragraph.Tab[2] := 250;
  redDisplay.Paragraph.Tab[3] := 300;
  redDisplay.Lines.Add
    ('Workshop' + #9 + 'Day 1' + #9 + 'Day 2' + #9 + 'Day 3' + #9 + 'Day 4' + #10);
  for w := 1 to numWorkshops do
  begin
    sLine := arrWorkshops[w];
    for d := 1 to 4 do
      sLine := sLine + #9 + IntToStr(arrBooking[w, d]);
    redDisplay.Lines.Add(sLine);
  end;
end;

procedure TfrmQuestion3.FormCreate(Sender: TObject);
begin
  CurrencyString := 'R';
  ShortDateFormat := 'YYYY/MM/DD';

  //lstDay.ItemIndex := 0;
end;

end.
