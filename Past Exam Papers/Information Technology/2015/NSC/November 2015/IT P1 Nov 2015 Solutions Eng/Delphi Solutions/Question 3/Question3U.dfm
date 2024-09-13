object frmQuestion3: TfrmQuestion3
  Left = 0
  Top = 0
  Caption = 'Question 3 Memorandum'
  ClientHeight = 706
  ClientWidth = 658
  Color = clBtnFace
  Font.Charset = ANSI_CHARSET
  Font.Color = clBlack
  Font.Height = -15
  Font.Name = 'Arial'
  Font.Style = []
  OldCreateOrder = False
  Position = poDesktopCenter
  OnCreate = FormCreate
  PixelsPerInch = 96
  TextHeight = 17
  object lblOutput: TLabel
    Left = 0
    Top = 273
    Width = 658
    Height = 17
    Align = alTop
    Anchors = []
    AutoSize = False
    Caption = '    Output area:'
    ExplicitTop = 275
  end
  object pnlClose: TPanel
    Left = 0
    Top = 649
    Width = 658
    Height = 57
    Align = alBottom
    TabOrder = 0
    DesignSize = (
      658
      57)
    object bmbClose: TBitBtn
      Left = 531
      Top = 13
      Width = 113
      Height = 33
      Anchors = [akRight, akBottom]
      DoubleBuffered = True
      Kind = bkClose
      ParentDoubleBuffered = False
      TabOrder = 0
    end
  end
  object pnlInput: TPanel
    Left = 0
    Top = 0
    Width = 658
    Height = 273
    Align = alTop
    BevelInner = bvLowered
    TabOrder = 1
    object lbluserComponents: TLabel
      Left = 319
      Top = 2
      Width = 151
      Height = 17
      Align = alCustom
      Caption = 'Additional components:'
    end
    object grpInput: TGroupBox
      Left = 2
      Top = 2
      Width = 311
      Height = 269
      Align = alLeft
      Caption = '  User input:'
      TabOrder = 0
      object lblWorkshopQuestion: TLabel
        Left = 16
        Top = 30
        Width = 254
        Height = 17
        Caption = 'Select the workshop you want to attend'
      end
      object lblTopic: TLabel
        Left = 16
        Top = 72
        Width = 71
        Height = 17
        Caption = 'Workshop:'
      end
      object lblDay: TLabel
        Left = 16
        Top = 152
        Width = 30
        Height = 17
        Caption = 'Day:'
      end
      object Label1: TLabel
        Left = 16
        Top = 112
        Width = 214
        Height = 17
        Caption = 'Select the day you want to attend'
      end
      object cboTopic: TComboBox
        Left = 104
        Top = 72
        Width = 171
        Height = 25
        Style = csDropDownList
        ItemIndex = 0
        TabOrder = 0
        Text = 'Aerobics'
        Items.Strings = (
          'Aerobics'
          'Body building'
          'Cardio'
          'Dancing'
          'Energy supplements'
          'First Aid')
      end
      object lstDay: TListBox
        Left = 104
        Top = 152
        Width = 121
        Height = 97
        ItemHeight = 17
        Items.Strings = (
          'Day 1'
          'Day 2'
          'Day 3'
          'Day 4')
        TabOrder = 1
      end
    end
    object btnDisplay: TButton
      Left = 408
      Top = 48
      Width = 153
      Height = 33
      Caption = 'Display'
      TabOrder = 1
      OnClick = btnDisplayClick
    end
    object btnBook: TButton
      Left = 408
      Top = 98
      Width = 153
      Height = 33
      Caption = 'Book a workshop'
      TabOrder = 2
      OnClick = btnBookClick
    end
    object btnCancelWorkshop: TButton
      Left = 408
      Top = 198
      Width = 153
      Height = 33
      Caption = 'Cancel a workshop'
      TabOrder = 3
      OnClick = btnCancelWorkshopClick
    end
    object btnWater: TButton
      Left = 408
      Top = 147
      Width = 153
      Height = 33
      Caption = 'Water requirements'
      TabOrder = 4
      OnClick = btnWaterClick
    end
  end
  object redDisplay: TRichEdit
    Left = 8
    Top = 298
    Width = 650
    Height = 345
    TabOrder = 2
  end
end
