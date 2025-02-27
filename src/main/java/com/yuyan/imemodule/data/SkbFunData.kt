package com.yuyan.imemodule.data

import com.yuyan.imemodule.R
import com.yuyan.imemodule.application.ImeSdkApplication
import com.yuyan.imemodule.entity.SkbFunItem
import com.yuyan.imemodule.prefs.behavior.SkbMenuMode

val commonSkbFuns = arrayOf(
    SkbMenuMode.CloseSKB.name,
    SkbMenuMode.Settings.name,
    SkbMenuMode.JianFan.name,
    SkbMenuMode.ClipBoard.name,
    SkbMenuMode.SwitchKeyboard.name,
    SkbMenuMode.EmojiKeyboard.name,
)

val allSkbFuns = arrayOf(
    SkbMenuMode.EmojiKeyboard.name,
    SkbMenuMode.SwitchKeyboard.name,
    SkbMenuMode.KeyboardHeight.name,
    SkbMenuMode.ClipBoard.name,
    SkbMenuMode.Phrases.name,
    SkbMenuMode.DarkTheme.name,
    SkbMenuMode.Feedback.name,
    SkbMenuMode.OneHanded.name,
    SkbMenuMode.NumberRow.name,
    SkbMenuMode.JianFan.name,
    SkbMenuMode.Mnemonic.name,
    SkbMenuMode.FloatKeyboard.name,
    SkbMenuMode.FlowerTypeface.name,
    SkbMenuMode.Custom.name,
    SkbMenuMode.Settings.name,
)


val menuSkbFunsPreset: Map<SkbMenuMode, SkbFunItem> = hashMapOf(
    SkbMenuMode.EmojiKeyboard to SkbFunItem(ImeSdkApplication.context.getString(R.string.emoji_setting), R.drawable.sdk_vector_menu_skb_emoji, SkbMenuMode.EmojiKeyboard),
    SkbMenuMode.SwitchKeyboard to SkbFunItem(ImeSdkApplication.context.getString(R.string.changeKeyboard), R.drawable.sdk_vector_menu_skb_keyboard, SkbMenuMode.SwitchKeyboard),
    SkbMenuMode.KeyboardHeight to SkbFunItem(ImeSdkApplication.context.getString(R.string.setting_ime_keyboard_height), R.drawable.sdk_vector_menu_skb_height, SkbMenuMode.KeyboardHeight),
    SkbMenuMode.ClipBoard to SkbFunItem(ImeSdkApplication.context.getString(R.string.clipboard), R.drawable.ic_clipboard, SkbMenuMode.ClipBoard),
    SkbMenuMode.Phrases to SkbFunItem(ImeSdkApplication.context.getString(R.string.phrases), R.drawable.ic_phrases, SkbMenuMode.Phrases),
    SkbMenuMode.DarkTheme to SkbFunItem(ImeSdkApplication.context.getString(R.string.keyboard_theme_night), R.drawable.sdk_vector_menu_skb_dark, SkbMenuMode.DarkTheme),
    SkbMenuMode.Feedback to SkbFunItem(ImeSdkApplication.context.getString(R.string.keyboard_feedback), R.drawable.sdk_vector_menu_skb_touch, SkbMenuMode.Feedback),
    SkbMenuMode.OneHanded to SkbFunItem(ImeSdkApplication.context.getString(R.string.keyboard_one_handed_mod), R.drawable.sdk_vector_menu_skb_one_hand, SkbMenuMode.OneHanded),
    SkbMenuMode.NumberRow to SkbFunItem(ImeSdkApplication.context.getString(R.string.engish_full_keyboard), R.drawable.sdk_vector_menu_skb_shuzihang, SkbMenuMode.NumberRow),
    SkbMenuMode.JianFan to SkbFunItem(ImeSdkApplication.context.getString(R.string.setting_jian_fan), R.drawable.sdk_vector_menu_skb_fanti, SkbMenuMode.JianFan),
    SkbMenuMode.Mnemonic to SkbFunItem(ImeSdkApplication.context.getString(R.string.keyboard_mnemonic_show), R.drawable.sdk_vector_menu_skb_mnemonic, SkbMenuMode.Mnemonic),
    SkbMenuMode.FloatKeyboard to SkbFunItem(ImeSdkApplication.context.getString(R.string.keyboard_menu_float), R.drawable.sdk_vector_menu_skb_float, SkbMenuMode.FloatKeyboard),
    SkbMenuMode.FlowerTypeface to SkbFunItem(ImeSdkApplication.context.getString(R.string.keyboard_flower_typeface), R.drawable.sdk_vector_menu_skb_flower, SkbMenuMode.FlowerTypeface),
    SkbMenuMode.Custom to SkbFunItem(ImeSdkApplication.context.getString(R.string.skb_item_custom), R.drawable.sdk_vector_menu_custom, SkbMenuMode.Custom),
    SkbMenuMode.Settings to SkbFunItem(ImeSdkApplication.context.getString(R.string.skb_item_settings), R.drawable.sdk_vector_menu_skb_setting, SkbMenuMode.Settings),
    SkbMenuMode.CloseSKB to SkbFunItem(ImeSdkApplication.context.getString(R.string.keyboard_iv_menu_close), R.drawable.ic_baseline_arrow_down, SkbMenuMode.CloseSKB),
    SkbMenuMode.ClearClipBoard to SkbFunItem(ImeSdkApplication.context.getString(R.string.clipboard_clear), R.drawable.ic_baseline_delete_24, SkbMenuMode.ClearClipBoard),
    SkbMenuMode.Doutu to SkbFunItem(ImeSdkApplication.context.getString(R.string.doutu), R.drawable.sdk_vector_menu_skb_doutu, SkbMenuMode.Doutu),
    SkbMenuMode.EmojiHot to SkbFunItem(ImeSdkApplication.context.getString(R.string.emoji_hot), R.drawable.sdk_vector_menu_skb_emoji_hot, SkbMenuMode.EmojiHot),
    SkbMenuMode.Emoticons to SkbFunItem(ImeSdkApplication.context.getString(R.string.emoticons), R.drawable.sdk_vector_menu_skb_emoticons, SkbMenuMode.Emoticons),
    SkbMenuMode.AddPhrases to SkbFunItem(ImeSdkApplication.context.getString(R.string.add_phrases), R.drawable.baseline_add_circle_24, SkbMenuMode.AddPhrases),
    )