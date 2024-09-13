program Question1_P;

uses
  Forms,
  Question1_U in 'Question1_U.pas' {frmL};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmL, frmL);
  Application.Run;
end.
