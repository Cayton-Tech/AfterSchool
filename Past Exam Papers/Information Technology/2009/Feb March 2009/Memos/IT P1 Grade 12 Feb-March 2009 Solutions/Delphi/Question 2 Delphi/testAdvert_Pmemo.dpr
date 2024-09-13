program testAdvert_Pmemo;

uses
  Forms,
  testAdvert_UMemo in 'testAdvert_UMemo.pas' {frmNewsPaper},
  AdvertU_xxxx in 'AdvertU_xxxx.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmNewsPaper, frmNewsPaper);
  Application.Run;
end.
