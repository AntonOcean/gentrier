package com.example.gentrier.domain.usecase

/**
 * Base interface for Use Cases (Interactors) in Clean Architecture
 */
interface BaseUseCase<in Params, out Type> {
    suspend operator fun invoke(params: Params): Type
}

/**
 * For use cases that don't require input parameters
 */
abstract class NoParamsUseCase<out Type> : BaseUseCase<Unit, Type> {
    suspend operator fun invoke(): Type = invoke(Unit)
} 