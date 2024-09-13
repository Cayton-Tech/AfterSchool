program Question2P_Memo;

uses
  Forms,
  Question2U_Memo in 'Question2U_Memo.pas' {frmQuestionTWO},
  StudentU in 'StudentU.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TfrmQuestionTWO, frmQuestionTWO);
  Application.Run;
end.
