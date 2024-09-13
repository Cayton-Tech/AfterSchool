program NewsPaperP;

uses
  Forms,
  NewsPaperU in 'NewsPaperU.pas' {frmNewspaper};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmNewspaper, frmNewspaper);
  Application.Run;
end.
