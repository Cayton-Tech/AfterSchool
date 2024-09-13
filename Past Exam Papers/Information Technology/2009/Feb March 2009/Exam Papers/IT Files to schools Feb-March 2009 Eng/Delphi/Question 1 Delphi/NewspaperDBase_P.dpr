program NewsPaperDBase_P;

uses
  Forms,
  NewsPaperDBase_U in 'NewsPaperDBase_U.pas' {frmN};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmN, frmN);
  Application.Run;
end.
