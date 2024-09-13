object frmQuest2: TfrmQuest2
  Left = 207
  Top = 206
  Width = 696
  Height = 480
  Caption = 'Question 2 - '
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  Menu = MainMenu1
  OldCreateOrder = False
  OnActivate = FormActivate
  PixelsPerInch = 96
  TextHeight = 13
  object redOutput: TRichEdit
    Left = 48
    Top = 16
    Width = 425
    Height = 273
    TabOrder = 0
  end
  object MainMenu1: TMainMenu
    Left = 8
    Top = 80
    object OptionList: TMenuItem
      Caption = 'List Items'
      OnClick = OptionListClick
    end
    object OptionQuit: TMenuItem
      Caption = 'Quit'
      OnClick = OptionQuitClick
    end
  end
end
