$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testMatrix.feature");
formatter.feature({
  "line": 2,
  "name": "Matrix",
  "description": "",
  "id": "matrix",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "check Matrix Creation",
  "description": "",
  "id": "matrix;check-matrix-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have set matrix size as 4",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I run method which creates matrix",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Matrix created with 4 elements in line/column",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 26
    }
  ],
  "location": "MatrixStepDefs.iHaveSetMatrixSizeAs(int)"
});
formatter.result({
  "duration": 137843310,
  "status": "passed"
});
formatter.match({
  "location": "MatrixStepDefs.iRunMethodWhichCreatesMatrix()"
});
formatter.result({
  "duration": 1559375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 20
    }
  ],
  "location": "MatrixStepDefs.matrixCreatedWithElementsInLineColumn(int)"
});
formatter.result({
  "duration": 3623199,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "check that matrix elements cannot be more than 9",
  "description": "",
  "id": "matrix;check-that-matrix-elements-cannot-be-more-than-9",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I have set matrix size as 5",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I run method which creates matrix",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Matrix elements are no more than 9",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepDefs.iHaveSetMatrixSizeAs(int)"
});
formatter.result({
  "duration": 120981,
  "status": "passed"
});
formatter.match({
  "location": "MatrixStepDefs.iRunMethodWhichCreatesMatrix()"
});
formatter.result({
  "duration": 269952,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 33
    }
  ],
  "location": "MatrixStepDefs.matrixElementsAreNoMoreThan(int)"
});
formatter.result({
  "duration": 1775834,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "check that matrix elements cannot be less than 1",
  "description": "",
  "id": "matrix;check-that-matrix-elements-cannot-be-less-than-1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I have set matrix size as 5",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I run method which creates matrix",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Matrix elements are no less than 1",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepDefs.iHaveSetMatrixSizeAs(int)"
});
formatter.result({
  "duration": 128445,
  "status": "passed"
});
formatter.match({
  "location": "MatrixStepDefs.iRunMethodWhichCreatesMatrix()"
});
formatter.result({
  "duration": 256268,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 33
    }
  ],
  "location": "MatrixStepDefs.matrixElementsAreNoLessThan(int)"
});
formatter.result({
  "duration": 117248,
  "status": "passed"
});
formatter.uri("testMaxNumberInSnail.feature");
formatter.feature({
  "line": 2,
  "name": "Max Number in Snail",
  "description": "",
  "id": "max-number-in-snail",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SnailSpecial"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Check That Snail Power Size Equals To Max Element",
  "description": "",
  "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I select matrix size as \"\u003csize\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I run method which creates Snail matrix",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I find max element in the matrix snail",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Max element is equal to \"\u003cexpected\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;",
  "rows": [
    {
      "cells": [
        "size",
        "expected"
      ],
      "line": 11,
      "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;;1"
    },
    {
      "cells": [
        "5",
        "25"
      ],
      "line": 12,
      "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;;2"
    },
    {
      "cells": [
        "6",
        "36"
      ],
      "line": 13,
      "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;;3"
    },
    {
      "cells": [
        "25",
        "625"
      ],
      "line": 14,
      "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;;4"
    },
    {
      "cells": [
        "20",
        "400"
      ],
      "line": 15,
      "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Check That Snail Power Size Equals To Max Element",
  "description": "",
  "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SnailSpecial"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I select matrix size as \"5\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I run method which creates Snail matrix",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I find max element in the matrix snail",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Max element is equal to \"25\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 25
    }
  ],
  "location": "MaxNumberInSnail.iSelectMatrixSizeAs(String)"
});
formatter.result({
  "duration": 1174663,
  "status": "passed"
});
formatter.match({
  "location": "MaxNumberInSnail.iRunMethodWhichCreatesSnailMatrix()"
});
formatter.result({
  "duration": 825716,
  "status": "passed"
});
formatter.match({
  "location": "MaxNumberInSnail.iFindMaxElementInTheMatrixSnail()"
});
formatter.result({
  "duration": 39808,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 25
    }
  ],
  "location": "MaxNumberInSnail.maxElementIsEqualTo(String)"
});
formatter.result({
  "duration": 112583,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Check That Snail Power Size Equals To Max Element",
  "description": "",
  "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SnailSpecial"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I select matrix size as \"6\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I run method which creates Snail matrix",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I find max element in the matrix snail",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Max element is equal to \"36\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 25
    }
  ],
  "location": "MaxNumberInSnail.iSelectMatrixSizeAs(String)"
});
formatter.result({
  "duration": 136842,
  "status": "passed"
});
formatter.match({
  "location": "MaxNumberInSnail.iRunMethodWhichCreatesSnailMatrix()"
});
formatter.result({
  "duration": 360454,
  "status": "passed"
});
formatter.match({
  "location": "MaxNumberInSnail.iFindMaxElementInTheMatrixSnail()"
});
formatter.result({
  "duration": 31411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "36",
      "offset": 25
    }
  ],
  "location": "MaxNumberInSnail.maxElementIsEqualTo(String)"
});
formatter.result({
  "duration": 87703,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Check That Snail Power Size Equals To Max Element",
  "description": "",
  "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SnailSpecial"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I select matrix size as \"25\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I run method which creates Snail matrix",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I find max element in the matrix snail",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Max element is equal to \"625\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 25
    }
  ],
  "location": "MaxNumberInSnail.iSelectMatrixSizeAs(String)"
});
formatter.result({
  "duration": 181005,
  "status": "passed"
});
formatter.match({
  "location": "MaxNumberInSnail.iRunMethodWhichCreatesSnailMatrix()"
});
formatter.result({
  "duration": 6511807,
  "status": "passed"
});
formatter.match({
  "location": "MaxNumberInSnail.iFindMaxElementInTheMatrixSnail()"
});
formatter.result({
  "duration": 50383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "625",
      "offset": 25
    }
  ],
  "location": "MaxNumberInSnail.maxElementIsEqualTo(String)"
});
formatter.result({
  "duration": 106363,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Check That Snail Power Size Equals To Max Element",
  "description": "",
  "id": "max-number-in-snail;check-that-snail-power-size-equals-to-max-element;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SnailSpecial"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I select matrix size as \"20\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I run method which creates Snail matrix",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I find max element in the matrix snail",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Max element is equal to \"400\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 25
    }
  ],
  "location": "MaxNumberInSnail.iSelectMatrixSizeAs(String)"
});
formatter.result({
  "duration": 119115,
  "status": "passed"
});
formatter.match({
  "location": "MaxNumberInSnail.iRunMethodWhichCreatesSnailMatrix()"
});
formatter.result({
  "duration": 3231334,
  "status": "passed"
});
formatter.match({
  "location": "MaxNumberInSnail.iFindMaxElementInTheMatrixSnail()"
});
formatter.result({
  "duration": 85837,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 25
    }
  ],
  "location": "MaxNumberInSnail.maxElementIsEqualTo(String)"
});
formatter.result({
  "duration": 119737,
  "status": "passed"
});
formatter.uri("testOOP.feature");
formatter.feature({
  "line": 2,
  "name": "Figures",
  "description": "",
  "id": "figures",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OOP"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "check calculation of area for round",
  "description": "",
  "id": "figures;check-calculation-of-area-for-round",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Nonstatic"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I have radius 5",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "calculate area for the round",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Area is \"15.707963267948966\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 14
    }
  ],
  "location": "OOPStepDefs.iHaveRadius(int)"
});
formatter.result({
  "duration": 1727318,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.calculateAreaForTheRound()"
});
formatter.result({
  "duration": 54426,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15.707963267948966",
      "offset": 9
    }
  ],
  "location": "OOPStepDefs.areaIs(String)"
});
formatter.result({
  "duration": 312870,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "check changing size for round with integer koef",
  "description": "",
  "id": "figures;check-changing-size-for-round-with-integer-koef",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Nonstatic"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I have radius 5",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I have koef \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "change size of the radius",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "calculate area for the round",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Area is \"31.41592653589793\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 14
    }
  ],
  "location": "OOPStepDefs.iHaveRadius(int)"
});
formatter.result({
  "duration": 141196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveKoef(String)"
});
formatter.result({
  "duration": 108230,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.changeSizeOfTheRadius()"
});
formatter.result({
  "duration": 44163,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.calculateAreaForTheRound()"
});
formatter.result({
  "duration": 31411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "31.41592653589793",
      "offset": 9
    }
  ],
  "location": "OOPStepDefs.areaIs(String)"
});
formatter.result({
  "duration": 143995,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "check changing size for round with double koef",
  "description": "",
  "id": "figures;check-changing-size-for-round-with-double-koef",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Nonstatic"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I have radius 5",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I have koef \"0.55\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "change size of the radius",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "calculate area for the round",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Area is \"8.63937979737193\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 14
    }
  ],
  "location": "OOPStepDefs.iHaveRadius(int)"
});
formatter.result({
  "duration": 135287,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.55",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveKoef(String)"
});
formatter.result({
  "duration": 560430,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.changeSizeOfTheRadius()"
});
formatter.result({
  "duration": 25502,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.calculateAreaForTheRound()"
});
formatter.result({
  "duration": 21459,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8.63937979737193",
      "offset": 9
    }
  ],
  "location": "OOPStepDefs.areaIs(String)"
});
formatter.result({
  "duration": 121914,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "check changing size for round with big koef",
  "description": "",
  "id": "figures;check-changing-size-for-round-with-big-koef",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Nonstatic"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I have radius 5",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I have koef \"4684584\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "change size of the radius",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "calculate area for the round",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Area is \"7.358527339762144E7\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 14
    }
  ],
  "location": "OOPStepDefs.iHaveRadius(int)"
});
formatter.result({
  "duration": 126267,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4684584",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveKoef(String)"
});
formatter.result({
  "duration": 88014,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.changeSizeOfTheRadius()"
});
formatter.result({
  "duration": 34210,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.calculateAreaForTheRound()"
});
formatter.result({
  "duration": 37009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7.358527339762144E7",
      "offset": 9
    }
  ],
  "location": "OOPStepDefs.areaIs(String)"
});
formatter.result({
  "duration": 135598,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "check area for square with integer side",
  "description": "",
  "id": "figures;check-area-for-square-with-integer-side",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@Nonstatic"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "I have side \"5\"",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "calculate area for the square",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Area for square is \"25\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveSide(String)"
});
formatter.result({
  "duration": 135909,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.calculateAreaForTheSquare()"
});
formatter.result({
  "duration": 64066,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 20
    }
  ],
  "location": "OOPStepDefs.areaForSquareIs(String)"
});
formatter.result({
  "duration": 99211,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "check area for square with double side",
  "description": "",
  "id": "figures;check-area-for-square-with-double-side",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@Nonstatic"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "I have side \"8.55\"",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "calculate area for the square",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Area for square is \"73.1025\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "8.55",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveSide(String)"
});
formatter.result({
  "duration": 131244,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.calculateAreaForTheSquare()"
});
formatter.result({
  "duration": 28302,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "73.1025",
      "offset": 20
    }
  ],
  "location": "OOPStepDefs.areaForSquareIs(String)"
});
formatter.result({
  "duration": 99211,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "check changing size for square with integer koef",
  "description": "",
  "id": "figures;check-changing-size-for-square-with-integer-koef",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@Nonstatic"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "I have side \"9\"",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "I have koef \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "change side size for square",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "calculate area for the square",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Area for square is \"729\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveSide(String)"
});
formatter.result({
  "duration": 130000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveKoef(String)"
});
formatter.result({
  "duration": 114450,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.changeSideSizeForSquare()"
});
formatter.result({
  "duration": 73086,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.calculateAreaForTheSquare()"
});
formatter.result({
  "duration": 41675,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "729",
      "offset": 20
    }
  ],
  "location": "OOPStepDefs.areaForSquareIs(String)"
});
formatter.result({
  "duration": 94856,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "check changing size for square with double koef",
  "description": "",
  "id": "figures;check-changing-size-for-square-with-double-koef",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 54,
      "name": "@Nonstatic"
    }
  ]
});
formatter.step({
  "line": 56,
  "name": "I have side \"9\"",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "I have koef \"3.55\"",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "change side size for square",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "calculate area for the square",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "Area for square is \"1020.8025\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveSide(String)"
});
formatter.result({
  "duration": 175096,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3.55",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveKoef(String)"
});
formatter.result({
  "duration": 141506,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.changeSideSizeForSquare()"
});
formatter.result({
  "duration": 75574,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.calculateAreaForTheSquare()"
});
formatter.result({
  "duration": 32345,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1020.8025",
      "offset": 20
    }
  ],
  "location": "OOPStepDefs.areaForSquareIs(String)"
});
formatter.result({
  "duration": 93924,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "check that square object created and is not null",
  "description": "",
  "id": "figures;check-that-square-object-created-and-is-not-null",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 62,
      "name": "@Nonstatic"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "I have side \"5.5\"",
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "area of the square is not null",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5.5",
      "offset": 13
    }
  ],
  "location": "OOPStepDefs.iHaveSide(String)"
});
formatter.result({
  "duration": 128756,
  "status": "passed"
});
formatter.match({
  "location": "OOPStepDefs.areaOfTheSquareIsNotNull()"
});
formatter.result({
  "duration": 69665,
  "status": "passed"
});
formatter.uri("testPalindrom.feature");
formatter.feature({
  "line": 2,
  "name": "Palindrom words and phrases",
  "description": "",
  "id": "palindrom-words-and-phrases",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "check that word is palindrom",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-word-is-palindrom",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I have work \"\u003cword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Word is palindrom",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-word-is-palindrom;",
  "rows": [
    {
      "cells": [
        "word"
      ],
      "line": 8,
      "id": "palindrom-words-and-phrases;check-that-word-is-palindrom;;1"
    },
    {
      "cells": [
        "мадам"
      ],
      "line": 9,
      "id": "palindrom-words-and-phrases;check-that-word-is-palindrom;;2"
    },
    {
      "cells": [
        "потоп"
      ],
      "line": 10,
      "id": "palindrom-words-and-phrases;check-that-word-is-palindrom;;3"
    },
    {
      "cells": [
        "шалаш"
      ],
      "line": 11,
      "id": "palindrom-words-and-phrases;check-that-word-is-palindrom;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "check that word is palindrom",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-word-is-palindrom;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I have work \"мадам\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Word is palindrom",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "мадам",
      "offset": 13
    }
  ],
  "location": "PalindromStepDefs.iHaveWork(String)"
});
formatter.result({
  "duration": 140263,
  "status": "passed"
});
formatter.match({
  "location": "PalindromStepDefs.wordIsPalindrom()"
});
formatter.result({
  "duration": 763204,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "check that word is palindrom",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-word-is-palindrom;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I have work \"потоп\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Word is palindrom",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "потоп",
      "offset": 13
    }
  ],
  "location": "PalindromStepDefs.iHaveWork(String)"
});
formatter.result({
  "duration": 121602,
  "status": "passed"
});
formatter.match({
  "location": "PalindromStepDefs.wordIsPalindrom()"
});
formatter.result({
  "duration": 31412,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "check that word is palindrom",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-word-is-palindrom;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I have work \"шалаш\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Word is palindrom",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "шалаш",
      "offset": 13
    }
  ],
  "location": "PalindromStepDefs.iHaveWork(String)"
});
formatter.result({
  "duration": 99521,
  "status": "passed"
});
formatter.match({
  "location": "PalindromStepDefs.wordIsPalindrom()"
});
formatter.result({
  "duration": 24570,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "check that word is not palindrom",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-word-is-not-palindrom",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I have word \"песня\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Word is not palindrom",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "песня",
      "offset": 13
    }
  ],
  "location": "PalindromStepDefs.iHaveWord(String)"
});
formatter.result({
  "duration": 111339,
  "status": "passed"
});
formatter.match({
  "location": "PalindromStepDefs.wordIsNotPalindrom()"
});
formatter.result({
  "duration": 2025882,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "check that case ignored in the word",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-case-ignored-in-the-word",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I have word \"АнНа\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Word is palindrom",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "АнНа",
      "offset": 13
    }
  ],
  "location": "PalindromStepDefs.iHaveWord(String)"
});
formatter.result({
  "duration": 110407,
  "status": "passed"
});
formatter.match({
  "location": "PalindromStepDefs.wordIsPalindrom()"
});
formatter.result({
  "duration": 68732,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "check that in frase ignored spaces",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-in-frase-ignored-spaces",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I have phrase \"Яд ем как мед я\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Phrase is palindrom",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Яд ем как мед я",
      "offset": 15
    }
  ],
  "location": "PalindromStepDefs.iHavePhrase(String)"
});
formatter.result({
  "duration": 348325,
  "status": "passed"
});
formatter.match({
  "location": "PalindromStepDefs.phraseIsPalindrom()"
});
formatter.result({
  "duration": 103253,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "check that if there is comma in phrase it isn\u0027t palindrom except cases when it is in the proper place",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-if-there-is-comma-in-phrase-it-isn\u0027t-palindrom-except-cases-when-it-is-in-the-proper-place",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "I have phrase \"Иди, Сеня, не сиди\"",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "Phrase is not palindrom",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Иди, Сеня, не сиди",
      "offset": 15
    }
  ],
  "location": "PalindromStepDefs.iHavePhrase(String)"
});
formatter.result({
  "duration": 133732,
  "status": "passed"
});
formatter.match({
  "location": "PalindromStepDefs.phraseIsNotPalindrom()"
});
formatter.result({
  "duration": 88326,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "check that phrase with a lot of spaces also will be considered as palindrom",
  "description": "",
  "id": "palindrom-words-and-phrases;check-that-phrase-with-a-lot-of-spaces-also-will-be-considered-as-palindrom",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I have phrase \"Аргентина                    манит               негра\"",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "Phrase is palindrom",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Аргентина                    манит               негра",
      "offset": 15
    }
  ],
  "location": "PalindromStepDefs.iHavePhrase(String)"
});
formatter.result({
  "duration": 101387,
  "status": "passed"
});
formatter.match({
  "location": "PalindromStepDefs.phraseIsPalindrom()"
});
formatter.result({
  "duration": 88947,
  "status": "passed"
});
formatter.uri("testSnail.feature");
formatter.feature({
  "line": 2,
  "name": "Snail",
  "description": "",
  "id": "snail",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Snail"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "check position of last element",
  "description": "",
  "id": "snail;check-position-of-last-element",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "size of matrix snail is 20",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "create matrix",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "find last element",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "last element is on the left bottom corner",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 24
    }
  ],
  "location": "SnailStepDefs.sizeOfMatrixSnailIs(int)"
});
formatter.result({
  "duration": 209617,
  "status": "passed"
});
formatter.match({
  "location": "SnailStepDefs.createMatrix()"
});
formatter.result({
  "duration": 1857628,
  "status": "passed"
});
formatter.match({
  "location": "SnailStepDefs.findLastElement()"
});
formatter.result({
  "duration": 68110,
  "status": "passed"
});
formatter.match({
  "location": "SnailStepDefs.checkThatLastElementIsOnTheProperPlace()"
});
formatter.result({
  "duration": 232009,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "check that start element \u003d 1",
  "description": "",
  "id": "snail;check-that-start-element-\u003d-1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "size of matrix snail is 25",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "create matrix",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "check that first element is 1",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 24
    }
  ],
  "location": "SnailStepDefs.sizeOfMatrixSnailIs(int)"
});
formatter.result({
  "duration": 145861,
  "status": "passed"
});
formatter.match({
  "location": "SnailStepDefs.createMatrix()"
});
formatter.result({
  "duration": 5146810,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 28
    }
  ],
  "location": "SnailStepDefs.checkThatFirstElementIs(int)"
});
formatter.result({
  "duration": 127201,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "check that appropriate element in matrix has correct number",
  "description": "",
  "id": "snail;check-that-appropriate-element-in-matrix-has-correct-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "size of matrix snail is 22",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "create matrix",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "check that element in matrix column 4, row 6 is 209",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "22",
      "offset": 24
    }
  ],
  "location": "SnailStepDefs.sizeOfMatrixSnailIs(int)"
});
formatter.result({
  "duration": 136531,
  "status": "passed"
});
formatter.match({
  "location": "SnailStepDefs.createMatrix()"
});
formatter.result({
  "duration": 3191837,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 36
    },
    {
      "val": "6",
      "offset": 43
    },
    {
      "val": "209",
      "offset": 48
    }
  ],
  "location": "SnailStepDefs.checkThatElementInMatrixColumnRowIs(int,int,int)"
});
formatter.result({
  "duration": 221746,
  "status": "passed"
});
});