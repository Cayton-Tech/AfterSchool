program Question1_Pxxxx;

uses
  Forms,
  Question1_Uxxxx in 'Question1_Uxxxx.pas' {frmL};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmL, frmL);
  Application.Run;
end.
