program Question1P_Memo;

uses
  Forms,
  Question1U_Memo in 'Question1U_Memo.pas' {frmQuestionONE};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TfrmQuestionONE, frmQuestionONE);
  Application.Run;
end.
