unit NewsPaperDBase_U;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, DB, ADODB, Grids, DBGrids, ExtCtrls, Buttons;

type
  TfrmN = class(TForm)
    Panel1: TPanel;
    dbgA: TDBGrid;
    Panel2: TPanel;
    btnB: TButton;
    btnC: TButton;
    btnE: TButton;
    btnA: TButton;
    btnH: TButton;
    btnF: TButton;
    BitBtn1: TBitBtn;
    btnG: TButton;
    qryAdverts: TADOQuery;
    DataSource1: TDataSource;
    btnD: TButton;

  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmN: TfrmN;


implementation

{$R *.dfm}



end.
