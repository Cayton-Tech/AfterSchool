object frmSMSComp: TfrmSMSComp
  Left = 192
  Top = 114
  Width = 262
  Height = 333
  Caption = 'Question 3 -'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  Menu = MainMenu1
  OldCreateOrder = False
  OnCreate = FormCreate
  PixelsPerInch = 96
  TextHeight = 13
  object redDisplay: TRichEdit
    Left = 8
    Top = 0
    Width = 233
    Height = 273
    TabOrder = 0
  end
  object MainMenu1: TMainMenu
    Left = 16
    Top = 8
    object Processing: TMenuItem
      Caption = 'Processing'
      object ExtractPossibleWinners: TMenuItem
        Caption = 'Extract Possible Winners'
      end
      object SelectAndDisplayWinners: TMenuItem
        Caption = 'Select and Display Winners'
      end
    end
    object SaveWinners: TMenuItem
      Caption = 'Save Winners'
    end
    object Quit1: TMenuItem
      Caption = 'Quit'
      OnClick = Quit1Click
    end
  end
end
