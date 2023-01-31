package transactions.repository

import java.util.UUID

import errors.ApiError
import transactions.model.Transaction

import io.github.gaelrenoux.tranzactio.doobie._
import zio._

trait TransactionsRepository {
  def get(id: UUID): ZIO[Connection, ApiError, Option[Transaction]]

  def create(transaction: Transaction): ZIO[Connection, ApiError, Unit]
}
