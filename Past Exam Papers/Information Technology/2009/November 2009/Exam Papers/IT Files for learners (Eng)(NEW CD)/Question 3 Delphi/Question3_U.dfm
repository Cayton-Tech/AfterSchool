object Form1: TForm1
  Left = 192
  Top = 114
  Width = 696
  Height = 480
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
    Left = 0
    Top = 0
    Width = 688
    Height = 434
    Align = alClient
    ScrollBars = ssVertical
    TabOrder = 0
  end
  object MainMenu1: TMainMenu
    Left = 72
    Top = 24
    object mnuConvert: TMenuItem
      Caption = 'Convert'
    end
    object mnuDisplay: TMenuItem
      Caption = 'Duplicates'
    end
    object mnuQuit: TMenuItem
      Caption = 'Quit'
      OnClick = mnuQuitClick
    end
  end
end
