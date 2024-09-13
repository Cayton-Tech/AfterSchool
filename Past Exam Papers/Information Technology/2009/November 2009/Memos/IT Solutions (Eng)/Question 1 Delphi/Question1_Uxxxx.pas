unit Question1_Uxxxx;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, DB, ADODB, Grids, DBGrids, ExtCtrls, Buttons;

type
  TfrmL = class(TForm)
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
  frmL: TfrmL;

implementation

{$R *.dfm}

procedure TfrmL.btnListClick(Sender: TObject);
begin
  qryBandB.Active := False;
  qryBandB.SQL.Text := 'SELECT * FROM tblClients ORDER BY Surname, FName';
  qryBandB.Active := true;
end;

procedure TfrmL.btnMrFerreiraClick(Sender: TObject);
begin
  qryBandB.Active := False;
  qryBandB.SQL.Text := 'SELECT format(Sum (SellingPrice), "Currency") AS [Total Due] FROM tblOrders WHERE ' +
                       ' ClientNo = 1';
  qryBandB.Active := true;
end;

procedure TfrmL.btnEnglishClick(Sender: TObject);
begin
  qryBandB.Active := False;
  qryBandB.SQL.Text := 'DELETE FROM tblClients WHERE Nationality = "English"';
  qryBandB.ExecSQL;
  messageDlg ('English fans deleted.',mtInformation,[mbOK],0);
end;

procedure TfrmL.btnCostClick(Sender: TObject);
begin
  qryBandB.Active := False;
  qryBandB.SQL.Text := 'SELECT Date, Category, SellingPrice, SellingPrice - ((SellingPrice/125)* 25) ' +
                       ' AS [Cost] FROM tblOrders WHERE Clientno = 1';
  qryBandB.ExecSQL;
  qryBandB.Active := true;
end;

procedure TfrmL.btnDiscountClick(Sender: TObject);
begin
  qryBandB.Active := False;

  qryBandB.SQL.Text := 'UPDATE tblOrders SET SellingPrice = (SellingPrice - 5) WHERE SellingPrice >= 30';
  qryBandB.ExecSQL;
  qryBandB.SQL.Text := 'SELECT * FROM tblOrders';
  qryBandB.Active := true;

end;

procedure TfrmL.btnFaltemeyerClick(Sender: TObject);

begin
  qryBandB.Active := False;

  qryBandB.SQL.Text := 'INSERT into tblClients ( Title, Surname, FName, IDNumber, SA,' +
                       'Nationality) VALUES ("Mr","Faltemeyer", "Harald", ' +
                       '"7407185683074", false, "Swedish")';
  qryBandB.ExecSQL;
  messageDlg ('Record inserted.',mtInformation,[mbok],0);
end;

end.
