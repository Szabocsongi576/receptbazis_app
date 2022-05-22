/*
 * Recipebase REST API
 * Recipe database API description.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package hu.bme.aut.recipebase.network.model

import com.google.gson.annotations.SerializedName
import io.swagger.annotations.ApiModelProperty
import java.lang.StringBuilder
import java.util.*

/**
 * Show
 */
class Show {
    /**
     * Get name
     * @return name
     */
    @get:ApiModelProperty(example = "Tasty", value = "")
    @SerializedName("name")
    var name: String? = null

    /**
     * Get id
     * @return id
     */
    @get:ApiModelProperty(example = "17.0", value = "")
    @SerializedName("id")
    var id: Long? = null
    fun name(name: String?): Show {
        this.name = name
        return this
    }

    fun id(id: Long?): Show {
        this.id = id
        return this
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val show = o as Show
        return name == show.name &&
                id == show.id
    }

    override fun hashCode(): Int {
        return Objects.hash(name, id)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class Show {\n")
        sb.append("    name: ").append(toIndentedString(name)).append("\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("}")
        return sb.toString()
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private fun toIndentedString(o: Any?): String {
        return o?.toString()?.replace("\n", "\n    ") ?: "null"
    }
}