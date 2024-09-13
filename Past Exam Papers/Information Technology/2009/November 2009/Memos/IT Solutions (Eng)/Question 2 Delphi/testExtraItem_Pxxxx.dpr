program testExtraItem_Pxxxx;

uses
  Forms,
  testExtraItem_Uxxxx in 'testExtraItem_Uxxxx.pas' {frmQuest2},
  ExtraItemXXXX in 'ExtraItemXXXX.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmQuest2, frmQuest2);
  Application.Run;
end.
