program Question2_P;

uses
  Forms,
  Question2_U in 'Question2_U.pas' {frmQuest2};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmQuest2, frmQuest2);
  Application.Run;
end.
