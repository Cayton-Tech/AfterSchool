object frmQuestion1: TfrmQuestion1
  Left = 249
  Top = 56
  Width = 632
  Height = 594
  Caption = 'Question 1 - General problem solving'
  Color = clBtnFace
  Font.Charset = ANSI_CHARSET
  Font.Color = clBlack
  Font.Height = -13
  Font.Name = 'Arial'
  Font.Style = []
  OldCreateOrder = False
  Position = poScreenCenter
  PixelsPerInch = 96
  TextHeight = 16
  object pgcQuestion1: TPageControl
    Left = 0
    Top = 0
    Width = 616
    Height = 503
    ActivePage = tsQ1_2
    Align = alClient
    TabOrder = 0
    object tsQ1_1: TTabSheet
      Caption = 'Advertisement'
      object lblMarketValue: TLabel
        Left = 48
        Top = 26
        Width = 77
        Height = 16
        Caption = 'Market value:'
      end
      object lblSellingPrice: TLabel
        Left = 48
        Top = 58
        Width = 75
        Height = 16
        Caption = 'Selling price:'
        Font.Charset = ANSI_CHARSET
        Font.Color = clBlack
        Font.Height = -13
        Font.Name = 'Arial'
        Font.Style = []
        ParentFont = False
      end
      object lblNumBedrooms: TLabel
        Left = 48
        Top = 101
        Width = 124
        Height = 16
        Caption = 'Number of bedrooms:'
      end
      object lblNumBathrooms: TLabel
        Left = 48
        Top = 136
        Width = 128
        Height = 16
        Caption = 'Number of bathrooms:'
      end
      object chkPool: TCheckBox
        Left = 200
        Top = 176
        Width = 73
        Height = 17
        Caption = 'Pool'
        TabOrder = 4
      end
      object btnSalesAdd: TButton
        Left = 112
        Top = 208
        Width = 305
        Height = 49
        Caption = 'Generate advertisement'
        TabOrder = 5
        OnClick = btnSalesAddClick
      end
      object edtMarket: TEdit
        Left = 200
        Top = 18
        Width = 121
        Height = 24
        TabOrder = 0
        Text = '0'
      end
      object edtSellingPrice: TEdit
        Left = 200
        Top = 56
        Width = 121
        Height = 24
        TabOrder = 1
        Text = '0'
      end
      object edtBeds: TEdit
        Left = 200
        Top = 96
        Width = 121
        Height = 24
        TabOrder = 2
        Text = '0'
      end
      object edtBaths: TEdit
        Left = 200
        Top = 136
        Width = 121
        Height = 24
        TabOrder = 3
        Text = '0'
      end
      object grpAdvertisement: TGroupBox
        Left = 10
        Top = 281
        Width = 591
        Height = 163
        Caption = 'Advertisement'
        TabOrder = 6
        object redQ1: TRichEdit
          Left = 9
          Top = 21
          Width = 572
          Height = 132
          Align = alCustom
          Font.Charset = ANSI_CHARSET
          Font.Color = clBlack
          Font.Height = -13
          Font.Name = 'Arial'
          Font.Style = [fsBold]
          ParentFont = False
          TabOrder = 0
        end
      end
    end
    object tsQ1_2: TTabSheet
      Caption = 'Living room renovation'
      ImageIndex = 2
      object grpAreaRenovated: TGroupBox
        Left = 21
        Top = 6
        Width = 549
        Height = 95
        Caption = 'Area to be renovated in square metres'
        Ctl3D = False
        ParentCtl3D = False
        TabOrder = 0
        object lblAreaRenovated: TLabel
          Left = 9
          Top = 40
          Width = 182
          Height = 16
          Caption = 'Enter the area to be renovated: '
        end
        object lblUnit: TLabel
          Left = 296
          Top = 38
          Width = 15
          Height = 16
          Caption = 'm'#178
        end
        object edtArea: TEdit
          Left = 197
          Top = 36
          Width = 97
          Height = 24
          Ctl3D = True
          Font.Charset = ANSI_CHARSET
          Font.Color = clBlack
          Font.Height = -13
          Font.Name = 'Arial'
          Font.Style = []
          ParentCtl3D = False
          ParentFont = False
          TabOrder = 0
        end
      end
      object grpMethodRenovation: TGroupBox
        Left = 21
        Top = 120
        Width = 549
        Height = 337
        Caption = 'Choose the type of renovation:'
        Ctl3D = False
        ParentCtl3D = False
        TabOrder = 1
        object rbPaint: TRadioButton
          Left = 192
          Top = 52
          Width = 89
          Height = 19
          Caption = 'Painting'
          Font.Charset = ANSI_CHARSET
          Font.Color = clBlack
          Font.Height = -13
          Font.Name = 'Arial'
          Font.Style = []
          ParentFont = False
          TabOrder = 0
          OnClick = rbPaintClick
        end
        object rbTiling: TRadioButton
          Left = 321
          Top = 54
          Width = 64
          Height = 17
          Caption = 'Tiling'
          Font.Charset = ANSI_CHARSET
          Font.Color = clBlack
          Font.Height = -13
          Font.Name = 'Arial'
          Font.Style = []
          ParentFont = False
          TabOrder = 1
          OnClick = rbTilingClick
        end
        object redRenovate: TRichEdit
          Left = 80
          Top = 144
          Width = 407
          Height = 161
          Align = alCustom
          TabOrder = 2
        end
        object btnCost: TButton
          Left = 127
          Top = 77
          Width = 313
          Height = 49
          Caption = 'Calculate and display renovation cost'
          TabOrder = 3
          OnClick = btnCostClick
        end
      end
    end
    object tsQ1_3: TTabSheet
      Caption = 'Water and electricity'
      ImageIndex = 1
      object btnFindGeysers: TButton
        Left = 166
        Top = 244
        Width = 219
        Height = 41
        Caption = 'List geysers'
        TabOrder = 0
        OnClick = btnFindGeysersClick
      end
      object grpElectricityUsed: TGroupBox
        Left = 4
        Top = 12
        Width = 585
        Height = 128
        Caption = 'Calculate electricity used'
        Ctl3D = False
        ParentCtl3D = False
        TabOrder = 1
        object lblPrevReading: TLabel
          Left = 24
          Top = 65
          Width = 95
          Height = 16
          Caption = 'Previous reading'
        end
        object lblElectricity: TLabel
          Left = 484
          Top = 93
          Width = 25
          Height = 16
          Alignment = taCenter
          Caption = '0.00'
          Font.Charset = ANSI_CHARSET
          Font.Color = clBlack
          Font.Height = -13
          Font.Name = 'Arial'
          Font.Style = []
          ParentFont = False
        end
        object lblCurrReading: TLabel
          Left = 142
          Top = 65
          Width = 88
          Height = 16
          Caption = 'Current reading'
        end
        object lblHeadingElecKiloW: TLabel
          Left = 21
          Top = 31
          Width = 170
          Height = 16
          Caption = 'Electricity usage in kilowatts:'
        end
        object lblAmountDue: TLabel
          Left = 475
          Top = 59
          Width = 70
          Height = 16
          Caption = 'Amount due'
        end
        object edtPrev: TEdit
          Left = 24
          Top = 94
          Width = 81
          Height = 24
          Ctl3D = True
          ParentCtl3D = False
          TabOrder = 0
          Text = '2100'
        end
        object edtCurrent: TEdit
          Left = 142
          Top = 93
          Width = 89
          Height = 24
          Ctl3D = True
          ParentCtl3D = False
          TabOrder = 1
        end
        object btnCalcAmount: TButton
          Left = 289
          Top = 87
          Width = 139
          Height = 27
          Caption = 'Calculate amount due'
          TabOrder = 2
          OnClick = btnCalcAmountClick
        end
      end
      object grpGeyserOptions: TGroupBox
        Left = 7
        Top = 155
        Width = 584
        Height = 71
        Caption = 'Solar geyser options'
        Ctl3D = False
        ParentCtl3D = False
        TabOrder = 2
        object lblGeyserSizes: TLabel
          Left = 23
          Top = 30
          Width = 186
          Height = 16
          Caption = 'Enter geyser size (50, 100, 150)'
        end
        object edtSize: TEdit
          Left = 220
          Top = 28
          Width = 85
          Height = 24
          Ctl3D = True
          Font.Charset = ANSI_CHARSET
          Font.Color = clBlack
          Font.Height = -13
          Font.Name = 'Arial'
          Font.Style = []
          ParentCtl3D = False
          ParentFont = False
          TabOrder = 0
        end
      end
      object memGeysers: TMemo
        Left = 165
        Top = 306
        Width = 220
        Height = 156
        TabOrder = 3
      end
    end
  end
  object pnlButtons: TPanel
    Left = 0
    Top = 503
    Width = 616
    Height = 53
    Align = alBottom
    BevelInner = bvLowered
    TabOrder = 1
    DesignSize = (
      616
      53)
    object bmbClose: TBitBtn
      Left = 517
      Top = 16
      Width = 75
      Height = 25
      Anchors = [akRight, akBottom]
      TabOrder = 0
      Kind = bkClose
    end
  end
end
