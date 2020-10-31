import org.scalatest.funspec.AnyFunSpec

import com.github.pawelkrol.HelloWorld.Arguments

class ArgumentsSpec extends AnyFunSpec {

  describe("validate") {
    it("passes default name validation") {
      Arguments().validate
    }

    it("passes alphabetical name validation") {
      Arguments("Sunn").validate
    }

    it("passes name with empty space validation") {
      Arguments("Sunn O").validate
    }

    it("fails to validate non-alphabetical name") {
      intercept[IllegalArgumentException] {
        Arguments("Sunn O)))").validate
      }
    }
  }
}
