object Form1: TForm1
  Left = 192
  Top = 115
  Width = 702
  Height = 479
  Caption = 'Charity Gold Rush'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  OnCreate = FormCreate
  PixelsPerInch = 96
  TextHeight = 13
  object btnGenerateAndDisplay: TButton
    Left = 16
    Top = 8
    Width = 201
    Height = 25
    Caption = 'Process Gold Rush and Display'
    TabOrder = 0
    OnClick = btnGenerateAndDisplayClick
  end
  object redDisplay: TRichEdit
    Left = 16
    Top = 40
    Width = 665
    Height = 393
    Font.Charset = ANSI_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'Arial'
    Font.Style = [fsBold]
    ParentFont = False
    TabOrder = 1
  end
  object BitBtn1: TBitBtn
    Left = 592
    Top = 8
    Width = 83
    Height = 25
    TabOrder = 2
    Kind = bkClose
  end
end
