# SportradarFootballSC
This solution is based on the input from a user in the Terminal. 
The keywords that work for this solution are:

 -- START - this starts a match , asks for entries for a match to start

 -- FINISH - this ends an ongoing match.

 -- UPDATE --  updates a score of an existing match.

 -- SUMMARY -- shows the summary of all ongoing matches.

ASSUMPTIONS:

 -- assumed that updating to lower scores should be allowed 

 -- assumed that SUMMARY only shows matches that are ongoing.
finished matches are not included in the summary


Edge cases:

-- starting same match twice

-- starting of a new match with one of the team that already exist

-- updating a match that does not exist

-- trying a random keyword should show a log of wrong keyword.

Further development:

-- Input validation on team names could be added

-- Stricter input validation on team scores can be added
