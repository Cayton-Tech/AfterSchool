object frmQuest2: TfrmQuest2
  Left = 268
  Top = 207
  Width = 670
  Height = 474
  Caption = 'Question 2 -'
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
    Width = 657
    Height = 417
    TabOrder = 0
  end
  object MainMenu1: TMainMenu
    Left = 8
    Top = 8
    object mnuA: TMenuItem
      Caption = 'Option A'
    end
    object mnuB: TMenuItem
      Caption = 'Option B'
    end
    object Quit: TMenuItem
      Caption = '&Quit'
      OnClick = QuitClick
    end
  end
end
