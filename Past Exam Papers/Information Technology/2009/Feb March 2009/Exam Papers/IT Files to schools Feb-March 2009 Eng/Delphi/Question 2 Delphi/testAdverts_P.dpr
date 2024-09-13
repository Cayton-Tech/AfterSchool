program testAdverts_P;

uses
  Forms,
  testAdverts_U in 'testAdverts_U.pas' {frmN};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmN, frmN);
  Application.Run;
end.
