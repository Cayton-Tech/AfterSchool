unit Question1_U;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, DB, ADODB, Grids, DBGrids, ExtCtrls, Buttons;

type
  TfrmL = class(TForm)
    Panel1: TPanel;
    grdLitter: TDBGrid;
    Panel2: TPanel;
    btnDiff: TButton;
    btnAdjust: TButton;
    tblLitter: TDataSource;
    btnMembers: TButton;
    btnHistory: TButton;
    btnLow: TButton;
    BitBtn1: TBitBtn;
    btnOverdue: TButton;
    qryFF: TADOQuery;
    procedure btnDiffClick(Sender: TObject);
    procedure btnAdjustClick(Sender: TObject);

    procedure btnHistoryClick(Sender: TObject);
    procedure btnOverdueClick(Sender: TObject);
    procedure btnLowClick(Sender: TObject);
    procedure btnMembersClick(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  frmL: TfrmL;

implementation

{$R *.dfm}

procedure TfrmL.btnMembersClick(Sender: TObject);
begin
  qryFF.Active := False;
  qryFF.SQL.Text := 'TYPE YOUR SQL HERE';
  qryFF.Active := true;
end;

procedure TfrmL.btnDiffClick(Sender: TObject);
begin
  qryFF.Active := False;
  qryFF.SQL.Text := 'TYPE YOUR SQL HERE';
  qryFF.open;
end;

procedure TfrmL.btnOverdueClick(Sender: TObject);
begin
  qryFF.Active := False;
  qryFF.SQL.Text := 'TYPE YOUR SQL HERE';
  qryFF.ExecSQL;
  messagedlg ('Overdue accounts deleted.',mtInformation,[mbok],0);
end;

procedure TfrmL.btnLowClick(Sender: TObject);
begin
  qryFF.Active := False;
  qryFF.SQL.Text := 'TYPE YOUR SQL HERE';
  qryFF.ExecSQL;
  messagedlg ('Weights for May updated.',mtInformation,[mbok],0);
end;

procedure TfrmL.btnHistoryClick(Sender: TObject);
begin
  qryFF.Active := False;
  qryFF.SQL.Text := 'TYPE YOUR SQL HERE';
  qryFF.ExecSQL;
  qryFF.open;
end;

procedure TfrmL.btnAdjustClick(Sender: TObject);
begin
  qryFF.Active := False;
  qryFF.SQL.Text := 'TYPE YOUR SQL HERE';
  qryFF.ExecSQL;
  qryFF.open;
end;

end.
