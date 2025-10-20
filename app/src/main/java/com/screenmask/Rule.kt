
package com.screenmask

data class Rule(
    val id: Long,
    val left: Int,
    val top: Int,
    val right: Int,
    val bottom: Int,
    val color: Int,
    val enabled: Boolean
)

这个文件应该只有以上内容，总共12行。如果文件中有其他任何内容（如布局XML代码、其他类等），都需要删除。