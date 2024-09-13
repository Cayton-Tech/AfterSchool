object frmL: TfrmL
  Left = 204
  Top = 129
  Width = 812
  Height = 525
  Caption = 'Question 1 - '
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -12
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object Panel1: TPanel
    Left = 8
    Top = 8
    Width = 817
    Height = 457
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentFont = False
    TabOrder = 0
    object grdBandB: TDBGrid
      Left = 16
      Top = 8
      Width = 657
      Height = 441
      DataSource = tblBandB
      TabOrder = 0
      TitleFont.Charset = DEFAULT_CHARSET
      TitleFont.Color = clWindowText
      TitleFont.Height = -13
      TitleFont.Name = 'MS Sans Serif'
      TitleFont.Style = [fsBold]
    end
    object Panel2: TPanel
      Left = 680
      Top = 8
      Width = 121
      Height = 441
      BevelInner = bvLowered
      TabOrder = 1
      object btnMrFerreira: TButton
        Left = 8
        Top = 56
        Width = 105
        Height = 41
        Caption = '&Mr Ferreira'
        TabOrder = 0
        OnClick = btnMrFerreiraClick
      end
      object btnFaltemeyer: TButton
        Left = 8
        Top = 248
        Width = 105
        Height = 41
        Caption = '&Faltemeyer'
        TabOrder = 1
        OnClick = btnFaltemeyerClick
      end
      object btnList: TButton
        Left = 8
        Top = 8
        Width = 105
        Height = 41
        Caption = '&List'
        TabOrder = 2
        OnClick = btnListClick
      end
      object btnDiscount: TButton
        Left = 8
        Top = 200
        Width = 105
        Height = 41
        Caption = 'D&iscount'
        TabOrder = 3
        OnClick = btnDiscountClick
      end
      object btnCost: TButton
        Left = 8
        Top = 152
        Width = 105
        Height = 41
        Caption = '&Cost'
        TabOrder = 4
        OnClick = btnCostClick
      end
      object BitBtn1: TBitBtn
        Left = 8
        Top = 392
        Width = 105
        Height = 41
        TabOrder = 5
        Kind = bkClose
      end
      object btnEnglish: TButton
        Left = 8
        Top = 104
        Width = 105
        Height = 41
        Caption = '&English'
        TabOrder = 6
        OnClick = btnEnglishClick
      end
    end
  end
  object tblBandB: TDataSource
    DataSet = qryBandB
    Left = 696
  end
  object qryBandB: TADOQuery
    ConnectionString = 
      'Provider=Microsoft.Jet.OLEDB.4.0;Data Source=BandB.mdb;Persist S' +
      'ecurity Info=False'
    CursorType = ctStatic
    Parameters = <>
    SQL.Strings = (
      '')
    Left = 728
  end
end
