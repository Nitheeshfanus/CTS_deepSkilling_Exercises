function ListofPlayers(props) {
  const players = props.players;

  const playersBelow70 = players.filter(
    (player) => player.score < 70
  );

  return (
    <div>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            Mr. {player.name} {player.score}
          </li>
        ))}
      </ul>

      <hr />

      <h1>List of Players having Scores Less than 70</h1>

      <ul>
        {playersBelow70.map((player, index) => (
          <li key={index}>
            Mr. {player.name} {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;