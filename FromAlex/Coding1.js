class TeamStats {
   constructor(name, gameScores) {
      this.name = name;
      this.average = 0;
      this.gameScores = gameScores;
      this.calcAvg(gameScores);
   }

   calcAvg(gameScores) {
      for (const score of gameScores) {
         this.average += score;
      }
      this.average /= gameScores.length;
      if (parseInt(this.average) !== this.average) {
         this.average = this.average.toFixed(2);
      }
   }
}

function analyzeResults(...teams) {
   let best = 0;
   let winner;
   const ties = [];
   for (const team of teams) {
      if (team.average > best) {
         best = team.average;
         winner = team;
         ties.length = 0;
         ties.push(team);
      } else if (team.average === best) {
         ties.push(team);
      }
   }
   if (ties.length > 1) {
      let err = "There are multiple winners.  Teams "
      for (let i = 0; i < ties.length - 1; i++) {
         err += ties[i].name + ", ";
      }
      err += `${ties[ties.length - 1].name} had an average score of ${best}.`;
      throw err;
   }
   return winner;
}

const John = new TeamStats("John", [89,120,103]);
const Mike = new TeamStats("Mike", [116,94,123]);
const Mary = new TeamStats("Mary", [97,134,105]);

try {
   const winner = analyzeResults(John, Mike, Mary);
   console.log(`${winner.name} has the highest average, which is ${winner.average}!  Wow!`);
} catch (err) {
   console.log(err);
}