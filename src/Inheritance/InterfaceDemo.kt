package Inheritance

import Class.Customer
import java.lang.UnsupportedOperationException

fun main() {

    val repositoryImpl = RepositoryImpl<Customer>()

    repositoryImpl.getAll()
    repositoryImpl.getId(11)

}

interface Repository<T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

class RepositoryImpl<T> : Repository<T> {
    override fun getId(id: Int): T {
        throw UnsupportedOperationException("Unsupported opration exception")
    }

    override fun getAll(): List<T> {
        throw UnsupportedOperationException("Unsupported opration exception")
    }

}


interface Repo {
    fun <T> getById(id: Int): T
    fun <T> getAll(): List<T>
}

class RepoImpl : Repo{
    override fun <T> getById(id: Int): T {
        throw UnsupportedOperationException("Unsupported opration exception")
    }

    override fun <T> getAll(): List<T> {
        throw UnsupportedOperationException("Unsupported opration exception")
    }


}