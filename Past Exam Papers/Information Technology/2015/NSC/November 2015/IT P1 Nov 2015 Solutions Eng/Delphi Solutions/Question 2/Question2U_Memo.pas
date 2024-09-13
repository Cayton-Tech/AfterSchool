unit Question2U_Memo;

// A possible solution tom Question 2

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, Buttons, ComCtrls, ExtCtrls, StudentU;

type
  TfrmQuestionTWO = class(TForm)
    bmbClose: TBitBtn;
    lblFormHeading: TLabel;
    redQ2: TRichEdit;
    pnlButtons: TPanel;
    btnQuestion222: TButton;
    btnQuestion221: TButton;
    pnlQ223: TPanel;
    btnQuestion223: TButton;
    Label1: TLabel;
    edtTotalSessions: TEdit;
    btnQuestion224: TButton;
    pnlProgress: TPanel;
    lblProgress: TLabel;
    lblCompleted: TLabel;
    chkCompleted: TCheckBox;
    lblTrainingDate: TLabel;
    edtTrainingDate: TEdit;
    lblDate: TLabel;
    lblRegCode: TLabel;
    edtRegCode: TEdit;
    edtDate: TEdit;
    edtStudent: TEdit;
    procedure FormCreate(Sender: TObject);
    procedure btnQuestion221Click(Sender: TObject);
    procedure btnQuestion222Click(Sender: TObject);
    procedure btnQuestion223Click(Sender: TObject);
    procedure btnQuestion224Click(Sender: TObject);

  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmQuestionTWO: TfrmQuestionTWO;

implementation

var
  objStudent: TStudent;
{$R *.dfm}
{$R+}

// ==================================================================
// Question 2.2.1
procedure TfrmQuestionTWO.btnQuestion221Click(Sender: TObject);

begin
  objStudent := TStudent.Create(edtStudent.text, edtRegCode.text, edtDate.text);

  redQ2.Lines.Clear;
  redQ2.Lines.Add(objStudent.toString);
end;

// ==================================================================
// Question 2.2.2
procedure TfrmQuestionTWO.btnQuestion222Click(Sender: TObject);
var
  TxtFile: Textfile;
  sLine, sRegCode, sDate: string;
  iCount: integer;
begin

  if not FileExists('DataQ2.txt') then
  begin
    MessageDlg('File does not exists.', mtError, [mbOk], 0);
    Exit;
  end;

  AssignFile(TxtFile, 'DataQ2.txt');
  Reset(TxtFile);

  iCount := 0;
  redQ2.Clear;
  redQ2.Lines.Add('Name of student: ' + objStudent.GetName);
  redQ2.Lines.Add('Dates of completed sessions:');
  while NOT EOF(TxtFile) do
  begin
    readln(TxtFile, sLine);
    if pos(objStudent.GetCode, sLine) = 1 then
    begin
      Delete(sLine, 1, pos('on ', sLine) + 2);
      sDate := copy(sLine, 1, pos('#', sLine) - 1);
      Delete(sLine, 1, pos('#', sLine));
      if sLine = 'Completed' then
      begin
        redQ2.Lines.Add(sDate);
        inc(iCount, 1);
      end;
    end;
  end; // while
  objStudent.setSessionsCompleted(iCount);
  CloseFile(TxtFile);

  redQ2.Lines.Add(#10);
  redQ2.Lines.Add(objStudent.toString);

  btnQuestion223.Enabled := true;
  btnQuestion224.Enabled := true;
end;

// ==================================================================
// Question 2.2.3
procedure TfrmQuestionTWO.btnQuestion223Click(Sender: TObject);
var
  TxtFile: Textfile;
  sLine, sCompleted, sSesDate: string;
begin
  sSesDate := edtTrainingDate.text;

  if chkCompleted.Checked = false then
    sCompleted := 'Not Completed'
  else
  begin
    sCompleted := 'Completed';
    objStudent.increaseSessionsCompleted;
  end;

  sLine := objStudent.GetCode + ' trained on ' + sSesDate + '#' + sCompleted;

  AssignFile(TxtFile, 'DataQ2.txt');
  Append(TxtFile);
  writeln(TxtFile, sLine);
  CloseFile(TxtFile);

  ShowMessage('Information was successfully written to the file');

  redQ2.Lines.Clear;
  redQ2.Lines.Add(objStudent.toString);
end;
// ==================================================================
// Question 2.2.4

procedure TfrmQuestionTWO.btnQuestion224Click(Sender: TObject);
var
  iSessions: integer;
  sProgress: string;
begin
  iSessions := StrToInt(edtTotalSessions.text);
  sProgress := objStudent.evaluateProgress(iSessions);
  lblProgress.Caption := sProgress;
end;

// ==================================================================
// Supplied code
procedure TfrmQuestionTWO.FormCreate(Sender: TObject);
begin
  btnQuestion223.Enabled := false;
  btnQuestion224.Enabled := false;
end;

// ==================================================================

end.
