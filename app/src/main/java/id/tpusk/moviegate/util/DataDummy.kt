package id.tpusk.moviegate.util

import id.tpusk.moviegate.data.source.local.entity.MovieEntity
import id.tpusk.moviegate.data.source.local.entity.TvShowEntity
import id.tpusk.moviegate.data.source.remote.response.MovieResponse
import id.tpusk.moviegate.data.source.remote.response.TvShowResponse

object DataDummy {

    fun generateDummyMovie(): List<MovieEntity> {

        val movie = ArrayList<MovieEntity>()

        movie.add(
            MovieEntity(
                "01",
                "Spider-Man: No Way Home (2021)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "12/17/2021",
                "Action, Adventure, Science Fiction",
                "$200,000,000.00",
                "$1,161,281,855.00",
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "84"
            )
        )
        movie.add(
            MovieEntity(
                "02",
                "The Matrix Resurrections (2021)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8c4a8kE7PizaGQQnditMmI1xbRp.jpg",
                "12/22/2021",
                "Action, Science Fiction",
                "$190,000,000.00",
                "$69,000,000.00",
                "Plagued by strange memories, Neo's life takes an unexpected turn when he finds himself back inside the Matrix.",
                "72"
            )
        )
        movie.add(
            MovieEntity(
                "03",
                "Resident Evil: Welcome to Raccoon City (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3eVpNCMoi3C8lA0F0n2retnwvCK.jpg",
                "11/24/2021",
                "Horror, Action, Science Fiction ",
                "$40,000,000.00",
                "$31,000,000.00",
                "Once the booming home of pharmaceutical giant Umbrella Corporation, Raccoon City is now a dying Midwestern town. The company’s exodus left the city a wasteland…with great evil brewing below the surface. When that evil is unleashed, the townspeople are forever…changed…and a small group of survivors must work together to uncover the truth behind Umbrella and make it through the night.",
                "62"
            )
        )
        movie.add(
            MovieEntity(
                "04",
                "Encanto (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg",
                "11/24/2021",
                "Animation, Comedy, Family, Fantasy ",
                "-",
                "$1,200,000,000.00",
                "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
                "74"
            )
        )
        movie.add(
            MovieEntity(
                "05",
                "Venom: Let There Be Carnage (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg",
                "10/01/2021",
                "Science Fiction, Action, Adventure ",
                "$110,000,000.00",
                "$500,000,000.00",
                "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
                "72"
            )
        )
        movie.add(
            MovieEntity(
                "06",
                "Red Notice (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lAXONuqg41NwUMuzMiFvicDET9Y.jpg",
                "11/05/2021",
                "Action, Comedy, Crime, Thriller ",
                "$160,000,000.00",
                "$178,143.00",
                "An Interpol-issued Red Notice is a global alert to hunt and capture the world's most wanted. But when a daring heist brings together the FBI's top profiler and two rival criminals, there's no telling what will happen.",
                "68"
            )
        )
        movie.add(
            MovieEntity(
                "07",
                "Shang-Chi and the Legend of the Ten Rings (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg",
                "09/03/2021",
                "Action, Adventure, Fantasy ",
                "$150,000,000.00",
                "$430,238,384.00",
                "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.",
                "78"
            )
        )
        movie.add(
            MovieEntity(
                "08",
                "Sooryavanshi (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4pZyC1v0dF5tfv3KgwcvDc8RASe.jpg",
                "11/05/2021",
                "Action, Drama, Crime ",
                "$13,000,000.00",
                "$37,700,000.00",
                "A fearless, faithful albeit slightly forgetful Mumbai cop, Veer Sooryavanshi, the chief of the Anti-Terrorism Squad in India pulls out all the stops and stunts to thwart a major conspiracy to attack his city",
                "57"
            )
        )

        movie.add(
            MovieEntity(
                "09",
                "Clifford the Big Red Dog (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tY5jylU5wWaqRs8fmwkJBNzoyXB.jpg",
                "11/10/2021",
                "Animation, Comedy, Family ",
                "64,000,000.00",
                "67,000,000.00",
                "As Emily struggles to fit in at home and at school, she discovers a small red puppy who is destined to become her best friend. When Clifford magically undergoes one heck of a growth spurt, becomes a gigantic dog and attracts the attention of a genetics company, Emily and her Uncle Casey have to fight the forces of greed as they go on the run across New York City. Along the way, Clifford affects the lives of everyone around him and teaches Emily and her uncle the true meaning of acceptance and unconditional love.",
                "74"
            )
        )
        movie.add(
            MovieEntity(
                "10",
                "Sing 2 (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aWeKITRFbbwY8txG5uCj4rMCfSP.jpg",
                "12/22/2021",
                "Animation, Comedy, Family, Music ",
                "-",
                "$72,000,000.00",
                "Buster and his new cast now have their sights set on debuting a new show at the Crystal Tower Theater in glamorous Redshore City. But with no connections, he and his singers must sneak into the Crystal Entertainment offices, run by the ruthless wolf mogul Jimmy Crystal, where the gang pitches the ridiculous idea of casting the lion rock legend Clay Calloway in their show. Buster must embark on a quest to find the now-isolated Clay and persuade him to return to the stage.",
                "76"
            )
        )
        movie.add(
            MovieEntity(
                "11",
                "Eternals (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5L7bclqxXtsqsitP83KpkZbgTQ3.jpg",
                "11/05/2021",
                "Action, Adventure, Fantasy, Science Fiction ",
                "$200,000,000.00",
                "$400,000,000.00",
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                "71"
            )
        )
        movie.add(
            MovieEntity(
                "12",
                "The Last Duel (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zjrJE0fpzPvX8saJXj8VNfcjBoU.jpg",
                "10/15/2021",
                "Action, Drama, History",
                "$100,000,000.00",
                "$27,000,000.00",
                "King Charles VI declares that Knight Jean de Carrouges settle his dispute with his squire, Jacques Le Gris, by challenging him to a duel.",
                "76"
            )
        )
        return movie
    }

    fun generateDummyTvShow(): List<TvShowEntity> {

        val tvShow = ArrayList<TvShowEntity>()

        tvShow.add(
            TvShowEntity(
                "01",
                "Hawkeye (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pqzjCxPVc9TkVgGRWeAoMmyqkZV.jpg",
                "Action & Adventure, Drama ",
                "https://www.themoviedb.org/t/p/h30/gJ8VX6JSu3ciXHuC2dDGAo2lvwM.png",
                "Ended",
                "Former Avenger Clint Barton has a seemingly simple mission: get back to his family for Christmas. Possible? Maybe with the help of Kate Bishop, a 22-year-old archer with dreams of becoming a superhero. The two are forced to work together when a presence from Barton’s past threatens to derail far more than the festive spirit.",
                "85"
            )
        )
        tvShow.add(
            TvShowEntity(
                "02",
                "The Wheel of Time (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mpgDeLhl8HbhI03XLB7iKO6M6JE.jpg",
                "Sci-Fi & Fantasy, Drama ",
                "https://www.themoviedb.org/t/p/h30/ifhbNuuVnlwYy5oXA5VIb2YR8AZ.png",
                "Returning Series",
                "Follow Moiraine, a member of the shadowy and influential all-female organization called the “Aes Sedai” as she embarks on a dangerous, world-spanning journey with five young men and women. Moiraine believes one of them might be the reincarnation of an incredibly powerful individual, whom prophecies say will either save humanity or destroy it.",
                "80"
            )
        )
        tvShow.add(
            TvShowEntity(
                "03",
                "Sword Snow Stride (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4iKjC8jln6x1CZIugg3Ft7s0Nko.jpg",
                "Drama, Sci-Fi & Fantasy ",
                "https://www.themoviedb.org/t/p/h30/uBCIoV9AUGIdfXTrtJ6CRIxOZF6.png",
                "Returning Series",
                "We don't have an overview translated in English. Help us expand our database by adding one.",
                "60"
            )
        )
        tvShow.add(
            TvShowEntity(
                "04",
                "Marry Me, Marry You (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7qZUC0AQmSi7pxNP6cH3swkb8Is.jpg",
                "Drama, Comedy ",
                "https://www.themoviedb.org/t/p/h30/xal22lPb7A1c1FQoYdHzpOm37Kf.png",
                "Returning Series",
                "A couple navigates the traditional expectations attached to marriage — that it extends beyond one’s partner, and includes their friends and family, too.",
                "37"
            )
        )
        tvShow.add(
            TvShowEntity(
                "05",
                "The Witcher (2019) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7vjaCdMw15FEbXyLQTVa04URsPm.jpg",
                "Sci-Fi & Fantasy, Drama, Action & Adventure ",
                "https://www.themoviedb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png",
                "Returning Series",
                "Geralt of Rivia, a mutated monster-hunter for hire, journeys toward his destiny in a turbulent world where people often prove more wicked than beasts.",
                "82"
            )
        )
        tvShow.add(
            TvShowEntity(
                "06",
                "Chucky (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg",
                "Sci-Fi & Fantasy, Crime ",
                "https://www.themoviedb.org/t/p/h30/g1e0H0Ka97IG5SyInMXdJkHGKiH.png",
                "Returning Series",
                "After a vintage Chucky doll turns up at a suburban yard sale, an idyllic American town is thrown into chaos as a series of horrifying murders begin to expose the town’s hypocrisies and secrets. Meanwhile, the arrival of enemies — and allies — from Chucky’s past threatens to expose the truth behind the killings, as well as the demon doll’s untold origins.",
                "79"
            )
        )
        tvShow.add(
            TvShowEntity(
                "07",
                "Squid Game (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dDlEmu3EZ0Pgg93K2SVNLCjCSvE.jpg",
                "Action & Adventure, Mystery, Drama ",
                "https://www.themoviedb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png",
                "Ended",
                "Hundreds of cash-strapped players accept a strange invitation to compete in children's games—with high stakes. But, a tempting prize awaits the victor.",
                "78"
            )
        )
        tvShow.add(
            TvShowEntity(
                "08",
                "Yellowstone (2018) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bjVwnVFuDBKXHczMJBNKK3WAWdA.jpg",
                "Western, Drama ",
                "https://www.themoviedb.org/t/p/h30/4knr4ozp2IQrA3SMQlLSYKcM3ML.png",
                "Returning Series",
                "Follow the violent world of the Dutton family, who controls the largest contiguous ranch in the United States. Led by their patriarch John Dutton, the family defends their property against constant attack by land developers, an Indian reservation, and America’s first National Park.",
                "80"
            )
        )

        tvShow.add(
            TvShowEntity(
                "09",
                "Lucifer (2016) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ekZobS8isE6mA53RAiGDG93hBxL.jpg",
                "Crime, Sci-Fi & Fantasy ",
                "https://www.themoviedb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png",
                "Ended",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "85"
            )
        )

        tvShow.add(
            TvShowEntity(
                "10",
                "The Flash (2014) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
                "Drama, Sci-Fi & Fantasy ",
                "https://www.themoviedb.org/t/p/h30/ge9hzeaU7nMtQ4PjkFlc68dGAJ9.png",
                "Returning Series",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "78"
            )
        )
        tvShow.add(
            TvShowEntity(
                "11",
                "Days of Our Lives (1965) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7Zm7epVFEovMEVLpM6FvrjhaNXn.jpg",
                "Soap, Drama ",
                "https://www.themoviedb.org/t/p/h30/o3OedEP0f9mfZr33jz2BfXOUK5.png",
                "Returning Series",
                "The Horton and Brady broods endure the romantic trials of life in Salem, a Midwestern hamlet filled with evil geniuses, star-crossed lovers and a rich family h",
                "63"
            )
        )
        tvShow.add(
            TvShowEntity(
                "12",
                "Money Heist (2017) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/reEMJA1uzscCbkpeRJeTT2bjqUp.jpg",
                "Crime, Drama ",
                "https://www.themoviedb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png",
                "Ended",
                "To carry out the biggest heist in history, a mysterious man called The Professor recruits a band of eight robbers who have a single characteristic: none of them has anything to lose. Five months of seclusion - memorizing every step, every detail, every probability - culminate in eleven days locked up in the National Coinage and Stamp Factory of Spain, surrounded by police forces and with dozens of hostages in their power, to find out whether their suicide wager will lead to everything or nothing.",
                "83"
            )
        )
        return tvShow
    }

    fun generateRemoteDummyMovie(): List<MovieResponse> {

        val movie = ArrayList<MovieResponse>()

        movie.add(
            MovieResponse(
                "01",
                "Spider-Man: No Way Home (2021)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "12/17/2021",
                "Action, Adventure, Science Fiction",
                "$200,000,000.00",
                "$1,161,281,855.00",
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "84"
            )
        )
        movie.add(
            MovieResponse(
                "02",
                "The Matrix Resurrections (2021)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8c4a8kE7PizaGQQnditMmI1xbRp.jpg",
                "12/22/2021",
                "Action, Science Fiction",
                "$190,000,000.00",
                "$69,000,000.00",
                "Plagued by strange memories, Neo's life takes an unexpected turn when he finds himself back inside the Matrix.",
                "72"
            )
        )
        movie.add(
            MovieResponse(
                "03",
                "Resident Evil: Welcome to Raccoon City (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3eVpNCMoi3C8lA0F0n2retnwvCK.jpg",
                "11/24/2021",
                "Horror, Action, Science Fiction ",
                "$40,000,000.00",
                "$31,000,000.00",
                "Once the booming home of pharmaceutical giant Umbrella Corporation, Raccoon City is now a dying Midwestern town. The company’s exodus left the city a wasteland…with great evil brewing below the surface. When that evil is unleashed, the townspeople are forever…changed…and a small group of survivors must work together to uncover the truth behind Umbrella and make it through the night.",
                "62"
            )
        )
        movie.add(
            MovieResponse(
                "04",
                "Encanto (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4j0PNHkMr5ax3IA8tjtxcmPU3QT.jpg",
                "11/24/2021",
                "Animation, Comedy, Family, Fantasy ",
                "-",
                "$1,200,000,000.00",
                "The tale of an extraordinary family, the Madrigals, who live hidden in the mountains of Colombia, in a magical house, in a vibrant town, in a wondrous, charmed place called an Encanto. The magic of the Encanto has blessed every child in the family with a unique gift from super strength to the power to heal—every child except one, Mirabel. But when she discovers that the magic surrounding the Encanto is in danger, Mirabel decides that she, the only ordinary Madrigal, might just be her exceptional family's last hope.",
                "74"
            )
        )
        movie.add(
            MovieResponse(
                "05",
                "Venom: Let There Be Carnage (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rjkmN1dniUHVYAtwuV3Tji7FsDO.jpg",
                "10/01/2021",
                "Science Fiction, Action, Adventure ",
                "$110,000,000.00",
                "$500,000,000.00",
                "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
                "72"
            )
        )
        movie.add(
            MovieResponse(
                "06",
                "Red Notice (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lAXONuqg41NwUMuzMiFvicDET9Y.jpg",
                "11/05/2021",
                "Action, Comedy, Crime, Thriller ",
                "$160,000,000.00",
                "$178,143.00",
                "An Interpol-issued Red Notice is a global alert to hunt and capture the world's most wanted. But when a daring heist brings together the FBI's top profiler and two rival criminals, there's no telling what will happen.",
                "68"
            )
        )
        movie.add(
            MovieResponse(
                "07",
                "Shang-Chi and the Legend of the Ten Rings (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg",
                "09/03/2021",
                "Action, Adventure, Fantasy ",
                "$150,000,000.00",
                "$430,238,384.00",
                "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.",
                "78"
            )
        )
        movie.add(
            MovieResponse(
                "08",
                "Sooryavanshi (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4pZyC1v0dF5tfv3KgwcvDc8RASe.jpg",
                "11/05/2021",
                "Action, Drama, Crime ",
                "$13,000,000.00",
                "$37,700,000.00",
                "A fearless, faithful albeit slightly forgetful Mumbai cop, Veer Sooryavanshi, the chief of the Anti-Terrorism Squad in India pulls out all the stops and stunts to thwart a major conspiracy to attack his city",
                "57"
            )
        )

        movie.add(
            MovieResponse(
                "09",
                "Clifford the Big Red Dog (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tY5jylU5wWaqRs8fmwkJBNzoyXB.jpg",
                "11/10/2021",
                "Animation, Comedy, Family ",
                "64,000,000.00",
                "67,000,000.00",
                "As Emily struggles to fit in at home and at school, she discovers a small red puppy who is destined to become her best friend. When Clifford magically undergoes one heck of a growth spurt, becomes a gigantic dog and attracts the attention of a genetics company, Emily and her Uncle Casey have to fight the forces of greed as they go on the run across New York City. Along the way, Clifford affects the lives of everyone around him and teaches Emily and her uncle the true meaning of acceptance and unconditional love.",
                "74"
            )
        )
        movie.add(
            MovieResponse(
                "10",
                "Sing 2 (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aWeKITRFbbwY8txG5uCj4rMCfSP.jpg",
                "12/22/2021",
                "Animation, Comedy, Family, Music ",
                "-",
                "$72,000,000.00",
                "Buster and his new cast now have their sights set on debuting a new show at the Crystal Tower Theater in glamorous Redshore City. But with no connections, he and his singers must sneak into the Crystal Entertainment offices, run by the ruthless wolf mogul Jimmy Crystal, where the gang pitches the ridiculous idea of casting the lion rock legend Clay Calloway in their show. Buster must embark on a quest to find the now-isolated Clay and persuade him to return to the stage.",
                "76"
            )
        )
        movie.add(
            MovieResponse(
                "11",
                "Eternals (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5L7bclqxXtsqsitP83KpkZbgTQ3.jpg",
                "11/05/2021",
                "Action, Adventure, Fantasy, Science Fiction ",
                "$200,000,000.00",
                "$400,000,000.00",
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                "71"
            )
        )
        movie.add(
            MovieResponse(
                "12",
                "The Last Duel (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zjrJE0fpzPvX8saJXj8VNfcjBoU.jpg",
                "10/15/2021",
                "Action, Drama, History",
                "$100,000,000.00",
                "$27,000,000.00",
                "King Charles VI declares that Knight Jean de Carrouges settle his dispute with his squire, Jacques Le Gris, by challenging him to a duel.",
                "76"
            )
        )
        return movie
    }

    fun generateRemoteDummyTvShow(): List<TvShowResponse> {

        val tvShow = ArrayList<TvShowResponse>()

        tvShow.add(
            TvShowResponse(
                "01",
                "Hawkeye (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pqzjCxPVc9TkVgGRWeAoMmyqkZV.jpg",
                "Action & Adventure, Drama ",
                "https://www.themoviedb.org/t/p/h30/gJ8VX6JSu3ciXHuC2dDGAo2lvwM.png",
                "Ended",
                "Former Avenger Clint Barton has a seemingly simple mission: get back to his family for Christmas. Possible? Maybe with the help of Kate Bishop, a 22-year-old archer with dreams of becoming a superhero. The two are forced to work together when a presence from Barton’s past threatens to derail far more than the festive spirit.",
                "85"
            )
        )
        tvShow.add(
            TvShowResponse(
                "02",
                "The Wheel of Time (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mpgDeLhl8HbhI03XLB7iKO6M6JE.jpg",
                "Sci-Fi & Fantasy, Drama ",
                "https://www.themoviedb.org/t/p/h30/ifhbNuuVnlwYy5oXA5VIb2YR8AZ.png",
                "Returning Series",
                "Follow Moiraine, a member of the shadowy and influential all-female organization called the “Aes Sedai” as she embarks on a dangerous, world-spanning journey with five young men and women. Moiraine believes one of them might be the reincarnation of an incredibly powerful individual, whom prophecies say will either save humanity or destroy it.",
                "80"
            )
        )
        tvShow.add(
            TvShowResponse(
                "03",
                "Sword Snow Stride (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4iKjC8jln6x1CZIugg3Ft7s0Nko.jpg",
                "Drama, Sci-Fi & Fantasy ",
                "https://www.themoviedb.org/t/p/h30/uBCIoV9AUGIdfXTrtJ6CRIxOZF6.png",
                "Returning Series",
                "We don't have an overview translated in English. Help us expand our database by adding one.",
                "60"
            )
        )
        tvShow.add(
            TvShowResponse(
                "04",
                "Marry Me, Marry You (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7qZUC0AQmSi7pxNP6cH3swkb8Is.jpg",
                "Drama, Comedy ",
                "https://www.themoviedb.org/t/p/h30/xal22lPb7A1c1FQoYdHzpOm37Kf.png",
                "Returning Series",
                "A couple navigates the traditional expectations attached to marriage — that it extends beyond one’s partner, and includes their friends and family, too.",
                "37"
            )
        )
        tvShow.add(
            TvShowResponse(
                "05",
                "The Witcher (2019) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7vjaCdMw15FEbXyLQTVa04URsPm.jpg",
                "Sci-Fi & Fantasy, Drama, Action & Adventure ",
                "https://www.themoviedb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png",
                "Returning Series",
                "Geralt of Rivia, a mutated monster-hunter for hire, journeys toward his destiny in a turbulent world where people often prove more wicked than beasts.",
                "82"
            )
        )
        tvShow.add(
            TvShowResponse(
                "06",
                "Chucky (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg",
                "Sci-Fi & Fantasy, Crime ",
                "https://www.themoviedb.org/t/p/h30/g1e0H0Ka97IG5SyInMXdJkHGKiH.png",
                "Returning Series",
                "After a vintage Chucky doll turns up at a suburban yard sale, an idyllic American town is thrown into chaos as a series of horrifying murders begin to expose the town’s hypocrisies and secrets. Meanwhile, the arrival of enemies — and allies — from Chucky’s past threatens to expose the truth behind the killings, as well as the demon doll’s untold origins.",
                "79"
            )
        )
        tvShow.add(
            TvShowResponse(
                "07",
                "Squid Game (2021) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dDlEmu3EZ0Pgg93K2SVNLCjCSvE.jpg",
                "Action & Adventure, Mystery, Drama ",
                "https://www.themoviedb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png",
                "Ended",
                "Hundreds of cash-strapped players accept a strange invitation to compete in children's games—with high stakes. But, a tempting prize awaits the victor.",
                "78"
            )
        )
        tvShow.add(
            TvShowResponse(
                "08",
                "Yellowstone (2018) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/bjVwnVFuDBKXHczMJBNKK3WAWdA.jpg",
                "Western, Drama ",
                "https://www.themoviedb.org/t/p/h30/4knr4ozp2IQrA3SMQlLSYKcM3ML.png",
                "Returning Series",
                "Follow the violent world of the Dutton family, who controls the largest contiguous ranch in the United States. Led by their patriarch John Dutton, the family defends their property against constant attack by land developers, an Indian reservation, and America’s first National Park.",
                "80"
            )
        )

        tvShow.add(
            TvShowResponse(
                "09",
                "Lucifer (2016) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ekZobS8isE6mA53RAiGDG93hBxL.jpg",
                "Crime, Sci-Fi & Fantasy ",
                "https://www.themoviedb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png",
                "Ended",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "85"
            )
        )

        tvShow.add(
            TvShowResponse(
                "10",
                "The Flash (2014) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
                "Drama, Sci-Fi & Fantasy ",
                "https://www.themoviedb.org/t/p/h30/ge9hzeaU7nMtQ4PjkFlc68dGAJ9.png",
                "Returning Series",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "78"
            )
        )
        tvShow.add(
            TvShowResponse(
                "11",
                "Days of Our Lives (1965) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7Zm7epVFEovMEVLpM6FvrjhaNXn.jpg",
                "Soap, Drama ",
                "https://www.themoviedb.org/t/p/h30/o3OedEP0f9mfZr33jz2BfXOUK5.png",
                "Returning Series",
                "The Horton and Brady broods endure the romantic trials of life in Salem, a Midwestern hamlet filled with evil geniuses, star-crossed lovers and a rich family h",
                "63"
            )
        )
        tvShow.add(
            TvShowResponse(
                "12",
                "Money Heist (2017) ",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/reEMJA1uzscCbkpeRJeTT2bjqUp.jpg",
                "Crime, Drama ",
                "https://www.themoviedb.org/t/p/h30/wwemzKWzjKYJFfCeiB57q3r4Bcm.png",
                "Ended",
                "To carry out the biggest heist in history, a mysterious man called The Professor recruits a band of eight robbers who have a single characteristic: none of them has anything to lose. Five months of seclusion - memorizing every step, every detail, every probability - culminate in eleven days locked up in the National Coinage and Stamp Factory of Spain, surrounded by police forces and with dozens of hostages in their power, to find out whether their suicide wager will lead to everything or nothing.",
                "83"
            )
        )
        return tvShow
    }
}