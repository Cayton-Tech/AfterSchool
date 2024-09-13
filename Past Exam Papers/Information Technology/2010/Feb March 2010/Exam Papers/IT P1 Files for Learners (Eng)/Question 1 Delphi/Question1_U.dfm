object frmL: TfrmL
  Left = 146
  Top = 133
  Width = 906
  Height = 525
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
    Left = 8
    Top = 8
    Width = 873
    Height = 457
    TabOrder = 0
    object grdLitter: TDBGrid
      Left = 16
      Top = 8
      Width = 673
      Height = 441
      DataSource = tblLitter
      TabOrder = 0
      TitleFont.Charset = DEFAULT_CHARSET
      TitleFont.Color = clWindowText
      TitleFont.Height = -11
      TitleFont.Name = 'MS Sans Serif'
      TitleFont.Style = []
    end
    object Panel2: TPanel
      Left = 688
      Top = 8
      Width = 177
      Height = 441
      BevelInner = bvLowered
      Font.Charset = DEFAULT_CHARSET
      Font.Color = clWindowText
      Font.Height = -13
      Font.Name = 'MS Sans Serif'
      Font.Style = [fsBold]
      ParentFont = False
      TabOrder = 1
      object btnDiff: TButton
        Left = 8
        Top = 56
        Width = 161
        Height = 41
        Caption = '&Weight Differences'
        TabOrder = 0
        OnClick = btnDiffClick
      end
      object btnAdjust: TButton
        Left = 8
        Top = 248
        Width = 161
        Height = 41
        Caption = '&Adjust Weights'
        TabOrder = 1
        OnClick = btnAdjustClick
      end
      object btnMembers: TButton
        Left = 8
        Top = 8
        Width = 161
        Height = 41
        Caption = '&All Member'
        TabOrder = 2
        OnClick = btnMembersClick
      end
      object btnHistory: TButton
        Left = 8
        Top = 200
        Width = 161
        Height = 41
        Caption = '&Weigh-in History'
        TabOrder = 3
        OnClick = btnHistoryClick
      end
      object btnLow: TButton
        Left = 7
        Top = 153
        Width = 162
        Height = 41
        Caption = '&Lowest Weight'
        TabOrder = 4
        OnClick = btnLowClick
      end
      object BitBtn1: TBitBtn
        Left = 8
        Top = 296
        Width = 161
        Height = 41
        TabOrder = 5
        Kind = bkClose
      end
      object btnOverdue: TButton
        Left = 8
        Top = 104
        Width = 161
        Height = 41
        Caption = '&Overdue Accounts'
        TabOrder = 6
        OnClick = btnOverdueClick
      end
    end
  end
  object tblLitter: TDataSource
    DataSet = qryFF
    Left = 24
    Top = 448
  end
  object qryFF: TADOQuery
    ConnectionString = 
      'Provider=Microsoft.Jet.OLEDB.4.0;Data Source=fatfighters.mdb;Per' +
      'sist Security Info=False'
    CursorType = ctStatic
    Parameters = <>
    SQL.Strings = (
      '')
    Left = 56
    Top = 448
  end
end
