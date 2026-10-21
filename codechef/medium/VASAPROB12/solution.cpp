
                                db.staff.insertMany(employees);

                                const slowSearch = db.staff.find({ empId: 4500 }).explain("executionStats");
                                print("Documents scanned before index: " + slowSearch.executionStats.totalDocsExamined);

                                // 1. Create the index on empId
                                db.staff.createIndex({ empId: 1 });

                                // 2. Query with explain to confirm only 1 document is examined
                                const fastSearch = db.staff.find({ empId: 4500 }).explain("executionStats");
                                print("Documents scanned after index: " + fastSearch.executionStats.totalDocsExamined);