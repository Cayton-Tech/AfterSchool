object frmQuestion3: TfrmQuestion3
  Left = 194
  Top = 220
  Width = 563
  Height = 341
  Caption = 'Question 3 - '
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -13
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  OnCreate = FormCreate
  PixelsPerInch = 96
  TextHeight = 16
  object redOutput: TRichEdit
    Left = 256
    Top = 8
    Width = 281
    Height = 289
    ScrollBars = ssVertical
    TabOrder = 0
  end
  object pnlButtons: TPanel
    Left = 24
    Top = 8
    Width = 217
    Height = 289
    BevelInner = bvRaised
    BevelOuter = bvLowered
    BevelWidth = 2
    TabOrder = 1
    object btnA: TButton
      Left = 16
      Top = 16
      Width = 185
      Height = 41
      Caption = 'Option &A'
      TabOrder = 0
    end
    object btnB: TButton
      Left = 16
      Top = 64
      Width = 185
      Height = 41
      Caption = 'Option &B'
      TabOrder = 1
    end
    object BitBtn1: TBitBtn
      Left = 24
      Top = 232
      Width = 177
      Height = 41
      TabOrder = 2
      Kind = bkClose
    end
  end
end
