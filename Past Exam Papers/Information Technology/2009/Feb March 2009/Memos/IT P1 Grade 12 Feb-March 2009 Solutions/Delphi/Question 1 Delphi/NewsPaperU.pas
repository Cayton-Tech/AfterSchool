unit NewsPaperU;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, DB, ADODB, Grids, DBGrids, ExtCtrls, Buttons;

type
  TfrmNewspaper = class(TForm)
    Panel1: TPanel;
    dbgAdverts: TDBGrid;
    Panel2: TPanel;
    btnAllAdverts: TButton;
    btnCatMonth: TButton;
    btnUpdateAdverts: TButton;
    btnDisplayClients: TButton;
    btnCountCellphones: TButton;
    btnCatNotPaid: TButton;
    BitBtn1: TBitBtn;
    btnCalcCosts: TButton;
    qryAdverts: TADOQuery;
    DataSource1: TDataSource;
    btnShortLongAdverts: TButton;
    procedure btnAllAdvertsClick(Sender: TObject);
    procedure btnCatMonthClick(Sender: TObject);
    procedure btnUpdateAdvertsClick(Sender: TObject);

    procedure btnCountCellphonesClick(Sender: TObject);
    procedure btnShortLongAdvertsClick(Sender: TObject);
    procedure btnCatNotPaidClick(Sender: TObject);
    procedure btnDisplayClientsClick(Sender: TObject);
    procedure btnCalcCostsClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmNewspaper: TfrmNewspaper;


implementation

{$R *.dfm}

procedure TfrmNewspaper.btnAllAdvertsClick(Sender: TObject);
begin
  qryAdverts.Active := False;
  qryAdverts.SQL.Text :=  'SELECT  AdvertID, DatePlaced, WeeksRunning, NumWords, Paid,Category, ClientName ' +
                          'FROM AdvertsTb, ClientsTb ' +
                          'WHERE AdvertsTB.ClientID = ClientsTB.ClientID';

  qryAdverts.Active := true;
end;

procedure TfrmNewspaper.btnCatMonthClick(Sender: TObject);
var
  monthNum :string;
  cat      :string;
begin
  cat := InputBox('Enter the category ', '', '');
  monthNum := InputBox('Enter the number of the month', '', '');

  qryAdverts.Active := False;

  qryAdverts.SQL.Text := 'SELECT  AdvertID, DatePlaced, WeeksRunning ' +
                         'FROM AdvertsTb ' +
                         'WHERE Category = "' + cat +'" AND MONTH(DatePlaced) = "' +monthNum +'"  ';
  qryAdverts.ExecSQL;

  qryAdverts.Active := true;

end;

procedure TfrmNewspaper.btnUpdateAdvertsClick(Sender: TObject);
var
  sAdvert :string;
  sNumber :string;
begin
  sAdvert := InputBox('Enter the ID of the Advert to be updated','','') ;

  sNumber := InputBox('Enter the number of words to be added?','','');

  qryAdverts.SQL.Text := 'UPDATE AdvertsTb SET numWords = numWords + "'+ sNumber +'"  '+
                        ' WHERE AdvertID = "' +sAdvert +'"  ';
  qryAdverts.ExecSQL;
  qryAdverts.SQL.Text := 'SELECT AdvertID, numWords AS Words FROM AdvertsTb';
  qryAdverts.Active := true;

end;

procedure TfrmNewspaper.btnShortLongAdvertsClick(Sender: TObject);
begin
  qryAdverts.Active := False;
  qryAdverts.SQL.Text := 'SELECT AdvertID, NumWords AS [Number of Words], ClientName AS [Client Name] '+
                         'FROM AdvertsTb, ClientsTb '+
                         'WHERE AdvertsTB.ClientID = ClientsTB.ClientID AND '+
                         '(NumWords > 30 OR NumWords < 15)' ;
  qryAdverts.Active := true;

end;

procedure TfrmNewspaper.btnCountCellphonesClick(Sender: TObject);

begin
  qryAdverts.Active := False;

  qryAdverts.SQL.Text := 'SELECT Count(*) AS [Number of clients with cellphone numbers]'+
                         'FROM ClientsTb WHERE [TelNum] Like "0%" ';

  qryAdverts.Active := true;
end;



procedure TfrmNewspaper.btnCatNotPaidClick(Sender: TObject);
var
  sLetter :string;
begin
  qryAdverts.Active := False;
  sLetter := InputBox('Eneter a letter of the alphabet ','','');
  qryAdverts.SQL.Text := 'SELECT AdvertID, Category, ClientName AS [Name of Client], Paid AS [Has Paid]'
                       + 'FROM ClientsTb, AdvertsTb '
                       + 'WHERE ClientsTb.ClientId =  AdvertsTb.ClientId and '
                       + 'AdvertsTb.Category like "' + sLetter + '%"  and AdvertsTb.Paid = false';
  qryAdverts.Active := true;
end;

procedure TfrmNewspaper.btnDisplayClientsClick(Sender: TObject);
begin
  qryAdverts.Active := False;
  qryAdverts.SQL.Text :=  'SELECT * FROM ClientsTb ORDER BY ClientName' ;
  qryAdverts.Active := true;
end;

procedure TfrmNewspaper.btnCalcCostsClick(Sender: TObject);
begin
  qryAdverts.Active := False;
  qryAdverts.SQL.Text := 'SELECT  AdvertID, DatePlaced, NumWords,  WeeksRunning, Format(NumWords * WeeksRunning * 0.5, "Currency") AS Cost, format(Cost + (Cost * 0.14),"Currency") AS [Cost & Vat]'+
                         'FROM AdvertsTb WHERE DatePlaced > #16/11/2008#' ;
  qryAdverts.Active := true;

end;

end.
