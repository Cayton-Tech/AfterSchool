object frmN: TfrmN
  Left = 35
  Top = 138
  Width = 940
  Height = 550
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
    object dbgA: TDBGrid
      Left = 8
      Top = 24
      Width = 713
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
      Left = 744
      Top = 8
      Width = 153
      Height = 441
      BevelInner = bvLowered
      TabOrder = 1
      object btnB: TButton
        Left = 8
        Top = 56
        Width = 137
        Height = 41
        Caption = '&B'
        TabOrder = 0
      end
      object btnC: TButton
        Left = 8
        Top = 104
        Width = 137
        Height = 41
        Caption = '&C'
        TabOrder = 1
      end
      object btnE: TButton
        Left = 8
        Top = 200
        Width = 137
        Height = 41
        Caption = '&E'
        TabOrder = 2
      end
      object btnA: TButton
        Left = 8
        Top = 8
        Width = 137
        Height = 41
        Caption = '&A'
        TabOrder = 3
      end
      object btnH: TButton
        Left = 8
        Top = 344
        Width = 137
        Height = 41
        Caption = '&H'
        TabOrder = 4
      end
      object btnF: TButton
        Left = 8
        Top = 248
        Width = 137
        Height = 41
        Caption = '&F'
        TabOrder = 5
      end
      object BitBtn1: TBitBtn
        Left = 8
        Top = 392
        Width = 137
        Height = 41
        TabOrder = 6
        Kind = bkClose
      end
      object btnG: TButton
        Left = 8
        Top = 296
        Width = 137
        Height = 41
        Caption = '&G'
        TabOrder = 7
      end
      object btnD: TButton
        Left = 8
        Top = 152
        Width = 137
        Height = 41
        Caption = '&D'
        TabOrder = 8
      end
    end
  end
  object qryAdverts: TADOQuery
    ConnectionString = 
      'Provider=Microsoft.Jet.OLEDB.4.0;Data Source=E:\IT Paneel\Grade ' +
      '12 2008\New Exemplar Paper 1 2008\Delphi Exemplar Quest 1 Memo\N' +
      'ewspaperDB.mdb;Persist Security Info=False'
    CursorType = ctStatic
    Parameters = <>
    SQL.Strings = (
      'Select * from AdvertsTb')
    Left = 96
    Top = 120
  end
  object DataSource1: TDataSource
    DataSet = qryAdverts
    Left = 96
    Top = 160
  end
end
