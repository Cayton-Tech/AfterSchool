object frmQuest2: TfrmQuest2
  Left = 197
  Top = 154
  Caption = 'Question 2 - '
  ClientHeight = 332
  ClientWidth = 572
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  Menu = MainMenu1
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object redOutput: TRichEdit
    Left = 0
    Top = 0
    Width = 572
    Height = 332
    Align = alClient
    ScrollBars = ssVertical
    TabOrder = 0
  end
  object MainMenu1: TMainMenu
    Left = 8
    Top = 24
    object OptionA1: TMenuItem
      Caption = 'Daily Report'
    end
    object OptionB1: TMenuItem
      Caption = 'Meals without Fats'
    end
    object OptionC1: TMenuItem
      Caption = 'Best and Worst Meals'
    end
    object Quit1: TMenuItem
      Caption = 'Quit'
      OnClick = Quit1Click
    end
  end
end
