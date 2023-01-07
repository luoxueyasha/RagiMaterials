package hiiragi283.ragi_materials.config

import net.minecraftforge.common.config.Configuration
import java.io.File

/*
  Thanks to defeatedcrow!
  Source: https://github.com/defeatedcrow/HeatAndClimateLib/blob/1.12.2_v3/main/java/defeatedcrow/hac/config/ClimateConfig.java
          https://github.com/defeatedcrow/HeatAndClimateLib/blob/1.12.2_v3/main/java/defeatedcrow/hac/config/CoreConfigDC.java
*/

object RagiConfig {

    //変数の宣言
    //Debug Setting
    var isDebug = false

    //configを読み込むメソッド
    fun load(file: File) {
        //configファイルを指定
        val config = Configuration(File(file, "ragi_materials.cfg"))
        try {
            //configの読み込み
            config.load()
            //各値の取得
            isDebug = config.get("debug setting", "Debug Log", isDebug, "If true, Ragi Library throws sooo many debug logs...").boolean
        } catch (e: Exception) {
            //エラーを出力
            e.printStackTrace()
        } finally {
            //configを保存
            config.save()
        }
    }
}