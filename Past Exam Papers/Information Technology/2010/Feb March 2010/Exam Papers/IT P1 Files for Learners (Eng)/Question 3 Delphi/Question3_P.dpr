program Question3_P;

uses
  Forms,
  Question3_U in 'Question3_U.pas' {frmSMSComp};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmSMSComp, frmSMSComp);
  Application.Run;
end.
