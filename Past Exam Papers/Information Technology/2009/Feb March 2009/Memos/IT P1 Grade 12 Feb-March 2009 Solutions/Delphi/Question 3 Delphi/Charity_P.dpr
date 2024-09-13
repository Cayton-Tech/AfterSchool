program Charity_P;

uses
  Forms,
  Charity_U in 'Charity_U.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
