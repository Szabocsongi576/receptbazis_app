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
 * Topics
 */
class Topics {
    /**
     * Get slug
     * @return slug
     */
    @get:ApiModelProperty(example = "brunch", value = "")
    @SerializedName("slug")
    var slug: String? = null

    /**
     * Get name
     * @return name
     */
    @get:ApiModelProperty(example = "Sunday Brunch", value = "")
    @SerializedName("name")
    var name: String? = null
    fun slug(slug: String?): Topics {
        this.slug = slug
        return this
    }

    fun name(name: String?): Topics {
        this.name = name
        return this
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val topics = o as Topics
        return slug == topics.slug &&
                name == topics.name
    }

    override fun hashCode(): Int {
        return Objects.hash(slug, name)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class Topics {\n")
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n")
        sb.append("    name: ").append(toIndentedString(name)).append("\n")
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