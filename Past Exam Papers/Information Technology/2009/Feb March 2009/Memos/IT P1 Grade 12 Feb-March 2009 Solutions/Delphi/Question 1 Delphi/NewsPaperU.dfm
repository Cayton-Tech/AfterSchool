object frmNewspaper: TfrmNewspaper
  Left = 62
  Top = 100
  Width = 940
  Height = 540
  Caption = 'Question 1 - '
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object Panel1: TPanel
    Left = 16
    Top = 8
    Width = 905
    Height = 489
    TabOrder = 0
    object dbgAdverts: TDBGrid
      Left = 8
      Top = 24
      Width = 721
      Height = 449
      DataSource = DataSource1
      TabOrder = 0
      TitleFont.Charset = DEFAULT_CHARSET
      TitleFont.Color = clWindowText
      TitleFont.Height = -11
      TitleFont.Name = 'MS Sans Serif'
      TitleFont.Style = []
    end
    object Panel2: TPanel
      Left = 736
      Top = 24
      Width = 161
      Height = 441
      BevelInner = bvLowered
      TabOrder = 1
      object btnAllAdverts: TButton
        Left = 8
        Top = 56
        Width = 145
        Height = 41
        Caption = 'All Advertisement&s'
        TabOrder = 0
        OnClick = btnAllAdvertsClick
      end
      object btnCatMonth: TButton
        Left = 8
        Top = 104
        Width = 145
        Height = 41
        Caption = 'Adverts/Category/&Month'
        TabOrder = 1
        OnClick = btnCatMonthClick
      end
      object btnUpdateAdverts: TButton
        Left = 8
        Top = 200
        Width = 145
        Height = 41
        Caption = '&Update Adverts'
        TabOrder = 2
        OnClick = btnUpdateAdvertsClick
      end
      object btnDisplayClients: TButton
        Left = 8
        Top = 8
        Width = 145
        Height = 41
        Caption = '&All Clients '
        TabOrder = 3
        OnClick = btnDisplayClientsClick
      end
      object btnCountCellphones: TButton
        Left = 8
        Top = 344
        Width = 145
        Height = 41
        Caption = 'Count Cell &Phones'
        TabOrder = 4
        OnClick = btnCountCellphonesClick
      end
      object btnCatNotPaid: TButton
        Left = 8
        Top = 248
        Width = 145
        Height = 41
        Caption = '&Not Paid'
        TabOrder = 5
        OnClick = btnCatNotPaidClick
      end
      object BitBtn1: TBitBtn
        Left = 8
        Top = 392
        Width = 145
        Height = 41
        TabOrder = 6
        Kind = bkClose
      end
      object btnCalcCosts: TButton
        Left = 8
        Top = 296
        Width = 145
        Height = 41
        Caption = 'A&dvert Costs'
        TabOrder = 7
        OnClick = btnCalcCostsClick
      end
      object btnShortLongAdverts: TButton
        Left = 8
        Top = 152
        Width = 145
        Height = 41
        Caption = '&Short / Long Adverts'
        TabOrder = 8
        OnClick = btnShortLongAdvertsClick
      end
    end
  end
  object qryAdverts: TADOQuery
    ConnectionString = 
      'Provider=Microsoft.Jet.OLEDB.4.0;Data Source=C:\Documents and Se' +
      'ttings\Office\Desktop\IT Supp Gr 12 2008 16 Aug\Gr 12 Supp Paper' +
      ' 1 2008\IT Grade 12 Supp Solutions P1\Delphi\Q1 Delphi\Newspaper' +
      'DB.mdb;Persist Security Info=False'
    CursorType = ctStatic
    Parameters = <>
    SQL.Strings = (
      'Select * from AdvertsTb')
    Left = 32
    Top = 88
  end
  object DataSource1: TDataSource
    DataSet = qryAdverts
    Left = 64
    Top = 88
  end
end
