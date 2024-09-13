unit Question2_U;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, Menus, StdCtrls, ComCtrls;

type
  TfrmQuest2 = class(TForm)
    MainMenu1: TMainMenu;
    OptionList: TMenuItem;
    Quit1: TMenuItem;
    redOutput: TRichEdit;
    procedure Quit1Click(Sender: TObject);
    

  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmQuest2: TfrmQuest2;

implementation



{$R *.dfm}


procedure TfrmQuest2.Quit1Click(Sender: TObject);
begin
 Close;
end;


end.
