object frmNewsPaper: TfrmNewsPaper
  Left = 201
  Top = 158
  Caption = 'Question 2 - '
  ClientHeight = 506
  ClientWidth = 775
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
    Left = 56
    Top = 16
    Width = 657
    Height = 449
    TabOrder = 0
  end
  object MainMenu1: TMainMenu
    Left = 88
    Top = 40
    object Aderts1: TMenuItem
      Caption = 'Adverts'
      object ListArray: TMenuItem
        Caption = '&Display Advert Information'
        OnClick = ListArrayClick
      end
      object SumIncome: TMenuItem
        Caption = '&Summarised Income Data'
        OnClick = SumIncomeClick
      end
      object LookupClient: TMenuItem
        Caption = '&Look up a client'
        OnClick = LookupClientClick
      end
    end
    object Quit1: TMenuItem
      Caption = '&Quit'
      OnClick = Quit1Click
    end
  end
end
