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
import java.math.BigDecimal
import java.util.*

/**
 * RecipeList
 */
class RecipeList {
    /**
     * Get count
     * @return count
     */
    @get:ApiModelProperty(example = "1556.0", value = "")
    @SerializedName("count")
    var count: BigDecimal? = null

    @SerializedName("results")
    private var results: MutableList<Recipe>? = null
    fun count(count: BigDecimal?): RecipeList {
        this.count = count
        return this
    }

    fun results(results: MutableList<Recipe>?): RecipeList {
        this.results = results
        return this
    }

    fun addResultsItem(resultsItem: Recipe): RecipeList {
        if (results == null) {
            results = ArrayList()
        }
        results!!.add(resultsItem)
        return this
    }

    /**
     * Get results
     * @return results
     */
    @ApiModelProperty(value = "")
    fun getResults(): List<Recipe>? {
        return results
    }

    fun setResults(results: MutableList<Recipe>?) {
        this.results = results
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val recipeList = o as RecipeList
        return count == recipeList.count &&
                results == recipeList.results
    }

    override fun hashCode(): Int {
        return Objects.hash(count, results)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class RecipeList {\n")
        sb.append("    count: ").append(toIndentedString(count)).append("\n")
        sb.append("    results: ").append(toIndentedString(results)).append("\n")
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