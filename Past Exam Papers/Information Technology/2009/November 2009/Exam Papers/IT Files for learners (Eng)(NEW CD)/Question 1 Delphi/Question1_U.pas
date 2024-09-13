unit Question1_U;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, DB, ADODB, Grids, DBGrids, ExtCtrls, Buttons;

type
  TfrmQuestion1 = class(TForm)
    Panel1: TPanel;
    grdBandB: TDBGrid;
    Panel2: TPanel;
    btnMrFerreira: TButton;
    btnFaltemeyer: TButton;
    tblBandB: TDataSource;
    btnList: TButton;
    btnDiscount: TButton;
    btnCost: TButton;
    BitBtn1: TBitBtn;
    btnEnglish: TButton;
    qryBandB: TADOQuery;
    procedure btnMrFerreiraClick(Sender: TObject);
    procedure btnFaltemeyerClick(Sender: TObject);
    procedure btnDiscountClick(Sender: TObject);
    procedure btnEnglishClick(Sender: TObject);
    procedure btnCostClick(Sender: TObject);
    procedure btnListClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmQuestion1: TfrmQuestion1;

implementation

{$R *.dfm}

procedure TfrmQuestion1.btnListClick(Sender: TObject);
begin

 //qryBandB.Active := False;
 //qryBandB.SQL.Text := ......
 //qryBandB.Active := true;

end;

procedure TfrmQuestion1.btnMrFerreiraClick(Sender: TObject);
begin
  //qryBandB.Active := False;
  //qryBandB.SQL.Text :=  .....
  //qryBandB.Active := true;
end;

procedure TfrmQuestion1.btnEnglishClick(Sender: TObject);
begin
  //qryBandB.Active := False;
 // qryBandB.SQL.Text := .....
  //qryBandB.ExecSQL;
 // qryBandB.Active := true;
end;
procedure TfrmQuestion1.btnCostClick(Sender: TObject);
begin
  //qryBandB.Active := False;
 // qryBandB.SQL.Text :=  .....
 // qryBandB.ExecSQL;
 // qryBandB.Active := true;
end;
procedure TfrmQuestion1.btnDiscountClick(Sender: TObject);

begin
 // qryBandB.Active := False;
 // qryBandB.SQL.Text := .....
 // qryBandB.ExecSQL;
 // qryBandB.SQL.Text := 'SELECT * FROM tblOrders';
 // qryBandB.Active := true;
end;

procedure TfrmQuestion1.btnFaltemeyerClick(Sender: TObject);
begin
  //qryBandB.Active := False;

  //qryBandB.SQL.Text := .....
  //qryBandB.ExecSQL;

  //qryBandB.Active := true;
end;

end.
